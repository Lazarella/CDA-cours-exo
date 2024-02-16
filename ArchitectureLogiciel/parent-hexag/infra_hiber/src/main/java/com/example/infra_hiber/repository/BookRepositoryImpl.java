package com.example.infra_hiber.repository;
import com.example.infra_hiber.entity.BookEntity;
import org.example.entity.Book;
import org.example.spi.port.BookRepository;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    private BookEntityRepository bookEntityRepository ;

    public BookRepositoryImpl(BookEntityRepository bookEntityRepository) {
        this.bookEntityRepository = bookEntityRepository;
    }

    @Override
    public boolean create(Book book) {
            try {
                //ouvrir session hibernate
                //ouvrir transaction
                BookEntity bookEntity =BookEntity.builder()
                        .title(book.getTitle())
                        .author(book.getAuthor())
                        .description(book.getDescription())
                        .build();
                bookEntityRepository.create(bookEntity);
                book.setId(bookEntity.getBook_id());
                return true;
            }catch (Exception exception) {
                return false;
            }
    }

    @Override
    public boolean delete(Long id) {

        return false;
    }

    @Override
    public boolean update(Long id) {
        return false;
    }

    @Override
    public Book findById(Long id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
