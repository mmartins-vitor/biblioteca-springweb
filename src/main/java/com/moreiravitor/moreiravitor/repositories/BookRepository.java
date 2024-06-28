package com.moreiravitor.moreiravitor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moreiravitor.moreiravitor.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
