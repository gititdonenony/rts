package com.rts.service.impl;

import com.rts.dto.UserRequest;
import com.rts.dto.UserResponse;
import com.rts.dto.UserUpdateRequest;
import com.rts.entity.User;
import com.rts.exception.UserNotFoundException;
import com.rts.mapper.UserMapper;
import com.rts.repository.UserRepository;
import com.rts.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserResponse createUser(UserRequest request) {
        User user = userMapper.toUser(request);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user = userRepository.save(user);
        return userMapper.toUserResponse(user);
    }

    @Override
    @Transactional
    public User updateUser(Long userId, UserUpdateRequest userUpdateRequest) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
        // Update the fields
        user.setName(userUpdateRequest.getName());
        user.setUsername(userUpdateRequest.getUsername());
        user.setEmail(userUpdateRequest.getEmail());
        user.setPhone(userUpdateRequest.getPhone());

        // Encrypt the new password if it's provided
        if (userUpdateRequest.getPassword() != null && !userUpdateRequest.getPassword().isEmpty()) {
            user.setPassword(passwordEncoder.encode(userUpdateRequest.getPassword()));
        }

        // Save the updated user
        return userRepository.save(user);
    }
}
