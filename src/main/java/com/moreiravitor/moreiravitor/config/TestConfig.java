package com.moreiravitor.moreiravitor.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.moreiravitor.moreiravitor.entities.Book;
import com.moreiravitor.moreiravitor.repositories.BookRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    
    
    @Autowired
    private BookRepository bookRepository;

    @Override
	public void run(String... args) throws Exception {

		Book b1 = new Book(null, "Senhor do aneos", "13", 1987, "Fantasia", "Vitor");
		Book b2 = new Book(null, "Star Wars", "12", 1999, "Fantasia", "pedro");
		

        bookRepository.saveAll(Arrays.asList(b1,b2));

	}

}
