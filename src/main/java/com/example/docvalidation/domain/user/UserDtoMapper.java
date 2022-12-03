package com.example.docvalidation.domain.user;

import com.example.docvalidation.domain.user.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserDtoMapper {

    public UserDto map(User user) {
        return new UserDto(user.getFirstName(), user.getLastName());
    }
}
