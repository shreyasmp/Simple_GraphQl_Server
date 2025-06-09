package com.example.graphqlserver;

import java.util.Arrays;
import java.util.List;

public record Author(String id, String firstName, String lastName) {

    private static List<Author> aitjprs = Arrays.asList(
            new Author("author-1", "Joshua", "Bloch"),
            new Author("author-2", "Brian", "Goetz"),
            new Author("author-3", "Robert", "C. Martin")
    );

    public static Author getById(String id) {
        return aitjprs.stream()
                .filter(author -> author.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
