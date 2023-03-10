package com.example.docvalidation.domain.document;

import com.example.docvalidation.domain.document.dto.DocumentDto;
import com.example.docvalidation.domain.document.dto.DocumentSaveDto;
import org.springframework.stereotype.Service;

import java.util.List;
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

    DocumentDto saveDocument(DocumentSaveDto documentSaveDto) {
        Document document = documentDtoMapper.mapSave(documentSaveDto);
        Document save = documentRepository.save(document);
        return documentDtoMapper.map(save);
    }

    List<DocumentDto> getAllDocs() {
        List<DocumentDto> documentDtos = documentRepository.findAllDocuments().stream().map(documentDtoMapper::map).toList();
        return documentDtos;
    }
}
