package com.example.docvalidation.domain.document;

import com.example.docvalidation.domain.document.dto.DocumentDto;
import com.example.docvalidation.domain.document.dto.DocumentSaveDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

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

    @PostMapping
    ResponseEntity<DocumentDto> save(@RequestBody DocumentSaveDto documentSaveDtoDto) {
        DocumentDto savedDocument = documentService.saveDocument(documentSaveDtoDto);
        URI savedDocumentUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedDocument.getId())
                .toUri();
        return ResponseEntity.created(savedDocumentUri).body(savedDocument); 
    }

    @GetMapping("/all-doc")
    List<DocumentDto> getAllDocs() {
        return documentService.getAllDocs();

    }
}
