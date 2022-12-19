package com.example.docvalidation.domain.user.dto;

public class UserDocumentsDto {
    private String id;
    private String nameOfCert;
    private String company;

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
