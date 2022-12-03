package com.example.docvalidation.domain.document.dto;

import com.example.docvalidation.domain.user.User;

public class DocumentDto {
    private String id;
    private String nameOfCert;
    private String company;
    private String user;

    public DocumentDto(String id, String nameOfCert, String company, String user) {
        this.id = id;
        this.nameOfCert = nameOfCert;
        this.company = company;
        this.user = user;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
