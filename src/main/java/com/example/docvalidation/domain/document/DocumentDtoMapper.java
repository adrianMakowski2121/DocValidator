package com.example.docvalidation.domain.document;

import com.example.docvalidation.domain.document.dto.DocumentDto;
import org.springframework.stereotype.Service;

@Service
public class DocumentDtoMapper {

    public DocumentDto map(Document document) {
        DocumentDto documentDto = new DocumentDto(
                document.getId(),
                document.getNameOfCert(),
                document.getCompany(),
                document.getUser().getFirstName(),
                document.getUser().getId());

        return documentDto;
    }

}
