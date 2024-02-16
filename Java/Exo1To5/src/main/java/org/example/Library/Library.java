package org.example.Library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList <Borrow> borrowed = new ArrayList<>();

    private ArrayList<Person> persons = new ArrayList<>();


    public Library() {
        this.books = new ArrayList<>();
        this.borrowed = new ArrayList<>();
        this.persons = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Borrow> getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(ArrayList<Borrow> borrowed) {
        this.borrowed = borrowed;
    }
    public boolean getBookByTitle(Book book){
    return books.add(book);
    }
    public void getBookByAuthor(){

    }
}
