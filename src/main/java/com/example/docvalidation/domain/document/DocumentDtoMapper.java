package com.example.docvalidation.domain.document;

import com.example.docvalidation.domain.document.dto.DocumentDto;
import com.example.docvalidation.domain.document.dto.DocumentSaveDto;
import com.example.docvalidation.domain.user.User;
import com.example.docvalidation.domain.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocumentDtoMapper {
    private final UserRepository userRepository;

    public DocumentDtoMapper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public DocumentDto map(Document document) {
        return new DocumentDto(document.getId(), document.getNameOfCert(), document.getCompany(), document.getUser().getId());
    }

    public Document map(DocumentDto dto) {
        User user = userRepository.findById(dto.getUserId()).orElseThrow();
        return new Document(dto.getId(), dto.getNameOfCert(), dto.getCompany(), user);
    }

    public Document mapSave(DocumentSaveDto documentSaveDto) {
        User user = userRepository.findById(documentSaveDto.getUserId()).orElseThrow();
        return new Document(documentSaveDto.getId(), documentSaveDto.getNameOfCert(), documentSaveDto.getCompany(), user);
    }
}
