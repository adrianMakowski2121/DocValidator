package com.example.docvalidation.domain.user;

import com.example.docvalidation.domain.user.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserDtoMapper userDtoMapper;

    public UserService(UserRepository userRepository, UserDtoMapper userDtoMapper) {
        this.userRepository = userRepository;
        this.userDtoMapper = userDtoMapper;
    }

    public Optional<UserDto> findUserById(Long id) {

        return userRepository.findUserById(id).map(userDtoMapper::map);
    }
}
