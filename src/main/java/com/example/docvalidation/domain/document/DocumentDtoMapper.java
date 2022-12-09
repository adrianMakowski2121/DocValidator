package com.example.docvalidation.domain.document;

import com.example.docvalidation.domain.document.dto.DocumentDto;
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
        DocumentDto documentDto = new DocumentDto(
                document.getId(),
                document.getNameOfCert(),
                document.getCompany(),
                document.getUser().getFirstName(),
                document.getUser().getId());

        return documentDto;
    }

    public Document map(DocumentDto dto) {
        Document document = new Document();
        document.setId(dto.getId());
        document.setNameOfCert(dto.getNameOfCert());
        document.setCompany(dto.getCompany());
        User user = userRepository.findById(dto.getUserId()).orElseThrow();
        document.setUser(user);
        return document;
    }
}
