package com.example.docvalidation.domain.document;

import com.example.docvalidation.domain.document.dto.DocumentDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocumentService {
    private final DocumentRepository documentRepository;
    private final DocumentDtoMapper documentDtoMapper;

    public DocumentService(DocumentRepository documentRepository, DocumentDtoMapper documentDtoMapper) {
        this.documentRepository = documentRepository;
        this.documentDtoMapper = documentDtoMapper;
    }

    Optional<DocumentDto> getDocumentById(String id) {
        return documentRepository.findById(id.toUpperCase()).map(documentDtoMapper::map);
    }


}
