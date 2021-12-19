package com.company.view.menu;

import java.util.Scanner;

public class MemberMenu {
    public static int MenuMember(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("select your request type : ");
        System.out.println(" 1)create \n" +
                " 2)show \n" +
                " 3)delete \n" +
                " 4)update \n" +
                " 5)search by id \n" +
                " 6)searchByName \n" +
                " 7)back \n" +
                " 8)Exit");
        int memberSelect=scanner.nextInt();
        return memberSelect;
    }
}
