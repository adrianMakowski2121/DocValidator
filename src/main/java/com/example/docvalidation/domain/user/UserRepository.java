package com.example.docvalidation.domain.user;

import com.example.docvalidation.domain.document.Document;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findUserById(Long id);

    @Query("SELECT e from User e")
    List<Document> getAllUsers();
}
