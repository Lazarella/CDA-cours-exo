package org.example.service;

import org.example.entity.Book;
import org.example.spi.port.BookRepository;
import org.hibernate.Session;

import java.util.List;

public class BookService {
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Book createBook(String title, String author, String description){
        Book book = new Book(title, author, description);
        if(bookRepository.create(book)){
            return book;
        }
        throw new RuntimeException();
    }
    public Book findById(Long id){
            Session session = HibernateSession.getSessionFactory().openSession();
            try (session) {
                todoRepository.setSession(session);
                Todo todo = todoRepository.findById(id);
                return todo.toDto();
            }
    }
    public boolean delete(Long id){
        return false;
    }

    public List<Book> findAll() {
        return null;
    }
    public Book changeTitle(Long id, String newTitle){
        Book book1 = bookRepository.findById(id);
        book1.setTitle(newTitle);
        return book1;
    }
}
