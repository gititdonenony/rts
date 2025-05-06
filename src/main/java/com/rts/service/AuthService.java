package com.rts.service;

import com.rts.dto.AuthResponse;
import com.rts.dto.LoginRequest;
import com.rts.dto.RegisterRequest;
import com.rts.entity.UserLogin;
import com.rts.exception.UserAlreadyExistsException;
import com.rts.repository.UserLoginRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserLoginRepository userLoginRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserLoginRepository userLoginRepository, PasswordEncoder passwordEncoder) {
        this.userLoginRepository = userLoginRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public AuthResponse register(RegisterRequest registerRequest) {
        if (userLoginRepository.existsByUsername(registerRequest.getUsername())) {
            throw new UserAlreadyExistsException("Username is already taken!");
        }

        UserLogin userLogin = new UserLogin();
        userLogin.setUsername(registerRequest.getUsername());
        userLogin.setPassword(passwordEncoder.encode(registerRequest.getPassword()));

        userLoginRepository.save(userLogin);

        return new AuthResponse("User registered successfully!", true);
    }

    public AuthResponse login(LoginRequest loginRequest) {
        UserLogin userLogin = userLoginRepository.findByUsername(loginRequest.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (passwordEncoder.matches(loginRequest.getPassword(), userLogin.getPassword())) {
            return new AuthResponse("Login successful!", true);
        } else {
            return new AuthResponse("Invalid password", false);
        }
    }
}
