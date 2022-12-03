package com.example.docvalidation.domain.user;

import com.example.docvalidation.domain.user.dto.UserDto;

public class UserDtoMapper {

    public UserDto map(User user) {
        return new UserDto(user.getFirstName(), user.getLastName());
    }
}
