package org.example.Library;

public class DigitalBook extends Book{
    private FormatDigitalBook format ;
    private int size;

    public DigitalBook(String title, String author,boolean isBorrowed, FormatDigitalBook format, int size ) {
        super(title, author, isBorrowed);
        this.format = format;
        this.size = size;
    }

    public FormatDigitalBook getFormat() {
        return format;
    }

    public void setFormat(DigitalBook format) {
        this.format = format.getFormat();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
