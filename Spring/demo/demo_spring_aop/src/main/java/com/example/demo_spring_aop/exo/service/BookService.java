package com.example.demo_spring_aop.exo.service;

import com.example.demo_spring_aop.exo.annotation.CustomAnnotation;
import com.example.demo_spring_aop.exo.entity.Book;
import com.example.demo_spring_aop.exo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@CustomAnnotation
@Service
public class BookService {

   private  BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBook(){
        System.out.println("Books List");
       List<Book> books = bookRepository.findAll();
        return books;

    }

    public void createBook(Book book){
    System.out.println("Create Book");
        bookRepository.save(book);
    }
    public void deleteBookByID(Long id){
        System.out.println("delete book with its id");
        bookRepository.deleteById(id);
    }
}
