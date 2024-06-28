package com.moreiravitor.moreiravitor.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moreiravitor.moreiravitor.entities.Book;
import com.moreiravitor.moreiravitor.services.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/books")
public class BookResource {
    
    @Autowired
    private BookService service;


    @GetMapping
    public ResponseEntity<List<Book>> findAll() {
        List<Book> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id) {
        Book obj = service.findbyId(id);
        return ResponseEntity.ok().body(obj);
    }
    
    
}
