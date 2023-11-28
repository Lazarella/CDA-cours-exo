package org.example.Library;

public abstract class Book {
    private int idBook;
    private String title;
    private String author;
    protected static int counter = 0 ;
    boolean isBorrowed = false;

    public Book(String title, String author, boolean isBorrowed) {
        this.idBook = ++counter;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book " +
                "idBook =" + idBook +
                ", title ='" + title + '\'' +
                ", author ='" + author + '\'' +
                '.';
    }
}
