package com.david.cleanarc.infrastructure.controllers;

import com.david.cleanarc.domain.entity.User;

public class UserDTOMapper {

    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.username(), user.email());
    }

    public User toUser(CreateUserRequest createUserRequest) {
        return new User(createUserRequest.username(), createUserRequest.password(), createUserRequest.email());
    }
}
