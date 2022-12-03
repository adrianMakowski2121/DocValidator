package com.example.docvalidation.domain.document;

import com.example.docvalidation.domain.document.dto.DocumentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/document")
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/{id}")
    ResponseEntity<DocumentDto> getDocument(@PathVariable String id) {
        return documentService.getDocumentById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

}
