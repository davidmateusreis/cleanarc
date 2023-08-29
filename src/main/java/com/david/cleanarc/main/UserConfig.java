package com.david.cleanarc.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.david.cleanarc.application.gateways.UserGateway;
import com.david.cleanarc.application.usecases.CreateUserInteractor;
import com.david.cleanarc.infrastructure.controllers.UserDTOMapper;
import com.david.cleanarc.infrastructure.gateways.UserEntityMapper;
import com.david.cleanarc.infrastructure.gateways.UserRepositoryGateway;
import com.david.cleanarc.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteractor createUserInteractor(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
