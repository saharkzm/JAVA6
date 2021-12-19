package com.company.view.menu;
import java.util.Scanner;

public class BookMenu {
    public static int menuBook(){
        Scanner scanner = new Scanner(System.in);
        int bookselect;
        System.out.println("select your request type : ");
        System.out.println(" 1)add \n" +
                " 2)show \n" +
                " 3)delete \n" +
                " 4)update \n" +
                " 5)search by id \n" +
                " 6)searchByName \n" +
                " 7)borrow menu\n" +
                " 8)back \n" +
                " 9)Exit");
        bookselect = scanner.nextInt();
        return bookselect;
    }
}
