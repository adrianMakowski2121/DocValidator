package com.example.docvalidation.domain.document;

import com.example.docvalidation.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "documents")
public class Document {

    @Id
    private String id;
    private String nameOfCert;
    private String company;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
