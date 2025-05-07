package com.rts.security;

import com.rts.entity.UserLogin;
import com.rts.repository.UserLoginRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserInfoDetailsService implements UserDetailsService {

    private final UserLoginRepository userLoginRepository;

    public UserInfoDetailsService(UserLoginRepository userLoginRepository) {
        this.userLoginRepository = userLoginRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserLogin user = userLoginRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
        return new UserInfoDetails(user.getUsername(), user.getPassword());
    }
}

