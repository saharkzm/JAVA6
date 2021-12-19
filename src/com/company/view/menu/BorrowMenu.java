package com.company.view.menu;
import java.util.Scanner;

public class BorrowMenu {
    public static int menuBorrow(){
        Scanner scanner=new Scanner(System.in);
        int borrowselect;
        System.out.println("select your request type : ");
        System.out.println("  1)borrow \n" +
                "  2)return \n" +
                "  3)show borrowed book \n" +
                "  4)Returned after expiration date \n" +
                "  5)back\n" +
                "  6)Exit \n"
        );
        borrowselect=scanner.nextInt();
        return borrowselect;
    }
}
