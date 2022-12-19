package com.example.docvalidation.domain.user;

import com.example.docvalidation.domain.document.Document;
import com.example.docvalidation.domain.user.dto.UserDocumentsDto;
import org.springframework.stereotype.Service;

@Service
public class UserDocumentsDtoMapper {
    UserDocumentsDto map(Document document) {
        UserDocumentsDto dto = new UserDocumentsDto();
        dto.setId(document.getId());
        dto.setNameOfCert(document.getNameOfCert());
        dto.setCompany(document.getCompany());
        return dto;
    }
}
