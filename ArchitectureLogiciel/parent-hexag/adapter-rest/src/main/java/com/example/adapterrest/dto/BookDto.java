package org.example.entity;

import jdk.jfr.DataAmount;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Book}
 */
public class BookDto implements Serializable {
    private final Long id;
    private final String title;
    private final String author;
    private final String description;

    public BookDto(Long id, String title, String author, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto entity = (BookDto) o;
        return Objects.equals(this.title, entity.title) &&
                Objects.equals(this.author, entity.author) &&
                Objects.equals(this.description, entity.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, description);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "title = " + title + ", " +
                "author = " + author + ", " +
                "description = " + description + ")";
    }
}