package com.rts.mapper;

import com.rts.dto.UserRequest;
import com.rts.dto.UserResponse;
import com.rts.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserRequest userRequest);

    UserResponse toUserResponse(User user);
}
