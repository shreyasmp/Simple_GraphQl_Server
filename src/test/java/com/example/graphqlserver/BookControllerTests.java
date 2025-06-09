package com.example.graphqlserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest(BookController.class)
public class BookControllerTests {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void shouldGetFirstBook() {
        this.graphQlTester
                .documentName("bookDetails")
                .variable("id", "book-1")
                .execute()
                .path("bookById")
                .matchesJson("" +
                        "{\n" +
                        "                        \"id\": \"book-1\",\n" +
                        "                        \"name\": \"Effective-Java\",\n" +
                        "                        \"pageCount\": 416,\n" +
                        "                        \"author\": {\n" +
                        "                          \"firstName\": \"Joshua\",\n" +
                        "                          \"lastName\": \"Bloch\"\n" +
                        "                        }\n" +
                        "                    }");
    }
}
