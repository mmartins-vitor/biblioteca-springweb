package com.moreiravitor.moreiravitor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moreiravitor.moreiravitor.repositories.BookRepository;
import com.moreiravitor.moreiravitor.entities.Book;

@Service
public class BookService {
    
    @Autowired
    private BookRepository repository;

    public List<Book> findAll(){
        return repository.findAll();
    }

    public Book findbyId(Long id){
        Optional<Book> obj = repository.findById(id);
        return obj.get();
    }


}
