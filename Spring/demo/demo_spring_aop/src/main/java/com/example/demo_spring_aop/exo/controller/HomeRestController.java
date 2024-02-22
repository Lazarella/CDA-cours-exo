package com.example.demo_spring_aop.exo.controller;

import com.example.demo_spring_aop.exo.entity.Book;
import com.example.demo_spring_aop.exo.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api")
public class HomeRestController {
    private BookService bookService;

    public HomeRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Book>> findAll() {
        List<Book> books = (List<Book>) bookService.getAllBook();
        return ResponseEntity.ok(books);
    }
    @PostMapping("/new-book")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        bookService.createBook(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-book")
    public void deleteBookById(@RequestBody  Long id){
        bookService.deleteBookByID(id);
    }
}
