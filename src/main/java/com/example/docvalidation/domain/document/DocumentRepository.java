package com.example.docvalidation.domain.document;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends CrudRepository<Document, String> {
    Document findDocumentById(String id);

    @Query("SELECT e from Document e")
    List<Document> findAllDocuments();

}
