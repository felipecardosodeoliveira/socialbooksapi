package com.fco.socialbooks.socialbooksapi.resources;

import com.fco.socialbooks.socialbooksapi.domain.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class BookResources {

    @GetMapping
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Sprint Rest"));
        books.add(new Book("Git passo-a-passo"));
        return books;
    }
}
