package com.company.service;

import com.company.entity.Book;
import com.company.view.io.BookIo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements CRUD<Book> {
    static long count = 1;
    Scanner scanner = new Scanner(System.in);
    static List<Book> booksList = new ArrayList<>();

    @Override
    public Long add() {
        Book book = BookIo.informationBook();
        book.setId(count);
        booksList.add(book);
        book.setExistingBook(true);
        BookIo.addBook();
        count++;
        return null;
    }

    @Override
    public Book show() {
        for (Book book : booksList) {
            System.out.println(book);
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Book book1=new Book();
        for (Book book:booksList){
            if (book.getId()== id) {
                book1=book;
                break;
            }
        }
        booksList.remove(book1);
        BookIo.removed();
    }

    @Override
    public Book update(long id) {
        for (Book book:booksList) {
            if (book.getId()== id) {
                Book book1= BookIo.updateBook(id);
                book.setNameBook(book1.getNameBook());
                book.setAuthor(book1.getAuthor());

            }
        }
        return null;
    }

    public static Book searchById(long id) {
        Book book1 = new Book();
        for (Book book : booksList) {
            if (book.getId() == id && book.getIsExistingBook()) {
                book1=book;
                System.out.println(book.toString());
                break;
            }
        }
        return book1;
    }

    public static void searchByName(String name){
        for (Book book : booksList) {
            if (book.getNameBook().equals(name)) {
                BookIo.showByName(book);
            }
        }
    }

}
