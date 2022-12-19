package com.example.docvalidation.domain.user;

import com.example.docvalidation.domain.document.DocumentDtoMapper;
import com.example.docvalidation.domain.document.dto.DocumentDto;
import com.example.docvalidation.domain.user.dto.UserDocumentsDto;
import com.example.docvalidation.domain.user.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserDtoMapper userDtoMapper;
    private final UserDocumentsDtoMapper userDocumentsDtoMapper;

    public UserService(UserRepository userRepository, UserDtoMapper userDtoMapper, UserDocumentsDtoMapper userDocumentsDtoMapper) {
        this.userRepository = userRepository;
        this.userDtoMapper = userDtoMapper;
        this.userDocumentsDtoMapper = userDocumentsDtoMapper;
    }

    public Optional<UserDto> findUserById(Long id) {

        return userRepository.findUserById(id).map(userDtoMapper::map);
    }

    public List<UserDocumentsDto> getDocumentsByUserId(Long id) {
        return userRepository.findById(id)
                .map(User::getDocuments)
                .orElse(Collections.emptyList())
                .stream().map(userDocumentsDtoMapper::map).toList();
    }
}
