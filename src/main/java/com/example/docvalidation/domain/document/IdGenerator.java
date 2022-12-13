package com.example.docvalidation.domain.document;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class IdGenerator {
    public static final Faker faker = new Faker();

    public static String generateId() {
        return faker.bothify("???##").toUpperCase();
    }
}
