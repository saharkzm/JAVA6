package com.company.entity;

public class Book {
    long id ;
    String nameBook;
    String author;
    boolean existingBook;

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public boolean getIsExistingBook() {
        return existingBook;
    }

    public void setExistingBook(boolean existingBook) {
        this.existingBook = existingBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", existingBook=" + existingBook +
                '}';
    }
}
