package com.example.docvalidation.domain.user;

import com.example.docvalidation.domain.user.dto.UserDocumentsDto;
import com.example.docvalidation.domain.user.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/user")
public class UserController {

    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id) {

        return userService.findUserById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/all")
    public List<UserDocumentsDto> getAllUserDocuments(@PathVariable Long id) {
        return userService.getDocumentsByUserId(id);
    }
}
