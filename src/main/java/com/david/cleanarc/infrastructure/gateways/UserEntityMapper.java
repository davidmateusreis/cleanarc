package com.david.cleanarc.infrastructure.gateways;

import com.david.cleanarc.domain.entity.User;
import com.david.cleanarc.infrastructure.persistence.UserEntity;

public class UserEntityMapper {

    UserEntity toEntity(User userDomainObject) {

        return new UserEntity(userDomainObject.username(), userDomainObject.password(), userDomainObject.email());
    }

    User toDomainObjetc(UserEntity userEntity) {

        return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
