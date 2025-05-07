package com.rts.service;

import com.rts.dto.AuthResponse;
import com.rts.dto.LoginRequest;
import com.rts.dto.RegisterRequest;
import com.rts.entity.UserLogin;
import com.rts.exception.UserAlreadyExistsException;
import com.rts.repository.UserLoginRepository;
import com.rts.security.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserLoginRepository userLoginRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthService(UserLoginRepository userLoginRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userLoginRepository = userLoginRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public AuthResponse register(RegisterRequest registerRequest) {
        if (userLoginRepository.existsByUsername(registerRequest.getUsername())) {
            throw new UserAlreadyExistsException("Username is already taken!");
        }

        UserLogin userLogin = new UserLogin();
        userLogin.setUsername(registerRequest.getUsername());
        userLogin.setPassword(passwordEncoder.encode(registerRequest.getPassword()));

        userLoginRepository.save(userLogin);

        String token = jwtUtil.generateToken(userLogin.getUsername());

        return new AuthResponse("User registered successfully!", true, null);
    }


    public AuthResponse login(LoginRequest loginRequest) {
        UserLogin userLogin = userLoginRepository.findByUsername(loginRequest.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (passwordEncoder.matches(loginRequest.getPassword(), userLogin.getPassword())) {
            String token = jwtUtil.generateToken(userLogin.getUsername());
            return new AuthResponse("Login successful!", true, token);
        } else {
            return new AuthResponse("Invalid password", false, null);
        }
    }


}
