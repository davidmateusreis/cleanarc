package com.david.cleanarc.infrastructure.gateways;

import com.david.cleanarc.application.gateways.UserGateway;
import com.david.cleanarc.domain.entity.User;
import com.david.cleanarc.infrastructure.persistence.UserEntity;
import com.david.cleanarc.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;

    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObject) {

        UserEntity userEntity = userEntityMapper.toEntity(userDomainObject);
        UserEntity savedObject = userRepository.save(userEntity);
        return userEntityMapper.toDomainObjetc(savedObject);
    }

}
