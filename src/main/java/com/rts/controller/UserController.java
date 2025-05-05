package com.rts.controller;

import com.rts.dto.UserRequest;
import com.rts.dto.UserResponse;
import com.rts.dto.UserUpdateRequest;
import com.rts.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    // Create user
    @PostMapping
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequest request) {
        UserResponse createdUser = userService.createUser(request);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Map<String, String>> updateUser(@PathVariable Long userId, @RequestBody UserUpdateRequest userUpdateRequest) {
        userService.updateUser(userId, userUpdateRequest);

        Map<String, String> response = new HashMap<>();
        response.put("message", "User updated successfully");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
