package com.david.cleanarc.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.cleanarc.application.usecases.CreateUserInteractor;
import com.david.cleanarc.domain.entity.User;

@RestController
@RequestMapping("users")
public class UserController {

    private final CreateUserInteractor createUserInteractor;

    private final UserDTOMapper userDTOMapper;

    public UserController(CreateUserInteractor createUserInteractor, UserDTOMapper userDTOMapper) {
        this.createUserInteractor = createUserInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest createUserRequest) {

        User userBusinessObject = userDTOMapper.toUser(createUserRequest);
        User user = createUserInteractor.createUser(userBusinessObject);
        return userDTOMapper.toResponse(user);
    }
}
