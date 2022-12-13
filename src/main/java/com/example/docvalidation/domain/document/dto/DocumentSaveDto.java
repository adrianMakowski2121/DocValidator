package com.example.docvalidation.domain.document.dto;

import com.example.docvalidation.domain.document.IdGenerator;
import com.example.docvalidation.domain.user.User;

public class DocumentSaveDto {
    private String id;
    private String nameOfCert;
    private String company;
    private Long userId;

    public DocumentSaveDto(String nameOfCert, String company, Long userId) {
        this.id = IdGenerator.generateId();
        this.nameOfCert = nameOfCert;
        this.company = company;
        this.userId = userId;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfCert() {
        return nameOfCert;
    }

    public void setNameOfCert(String nameOfCert) {
        this.nameOfCert = nameOfCert;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
