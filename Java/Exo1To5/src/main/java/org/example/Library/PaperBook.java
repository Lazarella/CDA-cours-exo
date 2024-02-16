package org.example.Library;

public class PaperBook extends Book{
    private long nbPage;
    private String publisher;

    public PaperBook(String title, String author, boolean isBorrowed, long nbPage, String publisher) {
        super(title, author, isBorrowed);
        this.nbPage = nbPage;
        this.publisher = publisher;
    }

    public PaperBook(String title, String author, boolean isBorrowed) {
        super(title, author, isBorrowed);
    }

    public long getNbPage() {
        return nbPage;
    }

    public void setNbPage(long nbPage) {
        this.nbPage = nbPage;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
