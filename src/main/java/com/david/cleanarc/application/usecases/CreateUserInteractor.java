package com.david.cleanarc.application.usecases;

import com.david.cleanarc.application.gateways.UserGateway;
import com.david.cleanarc.domain.entity.User;

public class CreateUserInteractor {

    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
