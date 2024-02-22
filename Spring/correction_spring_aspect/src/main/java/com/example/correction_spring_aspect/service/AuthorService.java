package com.example.correction_spring_aspect.service;

import com.example.correction_spring_aspect.annotation.Log;
import com.example.correction_spring_aspect.annotation.Transaction;
import com.example.correction_spring_aspect.entity.Author;
import com.example.correction_spring_aspect.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transaction
    public Author save(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        return authorRepository.save(author);
    }

    @Log
    public Author findById(long id) {
        Optional<Author> optionalAuthor = authorRepository.findById(id);
        if(optionalAuthor.isPresent()){
            return optionalAuthor.get();
        }
        throw new RuntimeException("Not found");
    }

    @Log
    public List<Author> findAll() {
        List<Author> authors = (List<Author>) authorRepository.findAll();
        return authors;
    }
}
