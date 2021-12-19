package com.company.view.menu;

import java.util.Scanner;

public class LibraryMenu {
    public static int showMenu() {
        Scanner scanner = new Scanner(System.in);
        int select;
        System.out.println("select your request type : ");
        System.out.println("1)member menu ");
        System.out.println("2)book menu ");
        System.out.println("3)Exit");
        select = scanner.nextInt();
        return select;
    }
}
