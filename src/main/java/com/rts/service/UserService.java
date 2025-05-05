package com.rts.service;

import com.rts.dto.UserRequest;
import com.rts.dto.UserResponse;
import com.rts.dto.UserUpdateRequest;
import com.rts.entity.User;

public interface UserService {

    UserResponse createUser(UserRequest request);

    User updateUser(Long userId, UserUpdateRequest userUpdateRequest);
}
