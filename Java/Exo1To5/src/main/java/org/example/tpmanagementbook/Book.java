package org.example.tpmanagementbook;

import java.util.Arrays;

public class Book {
    private long id;
    protected String name;
    protected Author[] authors;
    protected Publisher publisher;
    protected int publishingYear;
    protected int nbPages;
    protected double bookPrice;
    protected CoverType coverType;

    public Book(String name, Author[] authors, Publisher publisher, int publishingYear, int nbPages, double bookPrice, CoverType coverType) {
        this.id = getInt();
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.nbPages = nbPages;
        this.bookPrice = bookPrice;
        this.coverType = coverType;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    private long getInt(){
       id = Math.round(Math.random())*100000;
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", publishingYear=" + publishingYear +
                ", nbPages=" + nbPages +
                ", bookPrice=" + bookPrice +
                ", coverType=" + coverType +
                '}';
    }
}
