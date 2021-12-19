package com.company.view.io;

import com.company.entity.Book;

import java.util.Scanner;

public class BookIo {
    static long count = 1;
    public static Scanner scanner = new Scanner(System.in);

    public static Book informationBook() {
        Book book1 = new Book();
        System.out.println("Enter name and author:");
        book1.setNameBook(scanner.next());
        book1.setAuthor(scanner.next());
        book1.setExistingBook(true);
        return book1;
    }

    public static void addBook(){
        System.out.println("your id is : " + count);
        count++;
    }

    public static long getIdBook(){
        System.out.println("enter book id:");
        long id = scanner.nextLong();
        return id;
    }

    public static Book updateBook(long id){
        Book book=new Book();
        System.out.println("new name -- new author:");
        book.setNameBook(scanner.next());
        book.setAuthor(scanner.next());
        book.setExistingBook(true);
        return book;
    }

    public static void removed(){
        System.out.println("member removed");
    }

    public static String getname(){
        System.out.println("enter the book name:");
        String name =scanner.next();
        return name;
    }

    public static void showByName(Book book){
        System.out.println(book.toString());
    }

}
