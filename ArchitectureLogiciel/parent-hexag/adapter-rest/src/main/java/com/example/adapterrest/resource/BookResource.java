package com.example.adapterrest.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.entity.Book;
import org.example.entity.BookDto;
import org.example.service.BookService;

import java.util.List;

    @Path("book")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
public class BookResource {

        private final BookService bookService;

        @Inject
        public BookResource(BookService bookService) {
            this.bookService = bookService;
        }

        @GET
        public List<Book> get() {
            return bookService.findAll();
        }

        @GET
        @Path("{id}")
        public Book get(@PathParam("id") Long id) {
            return bookService.findById(id);

        }

        @POST
        public Book post(String title, String author, String description) {
            return bookService.createBook(title, author, description);
        }

        @PATCH
        @Path("{id}")
        public Book patchName(@PathParam("id") Long id, @QueryParam("title") String title) {
            return bookService.changeTitle(id, title);
        }

        @DELETE
        @Path("{id}")
        public boolean delete(@PathParam("id") Long id) {
            return bookService.delete(id);
        }
}
