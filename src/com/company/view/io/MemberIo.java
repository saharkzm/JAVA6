package com.company.view.io;

import com.company.entity.Member;

import java.util.Scanner;

public class MemberIo {
    public static Scanner scanner = new Scanner(System.in);

    public static Member EnterInformation() {
        Scanner scanner = new Scanner(System.in);
        Member member1 = new Member();
        System.out.println("Enter name -- age -- gender(f or m) :");
        member1.setName(scanner.next());
        member1.setAge(scanner.nextInt());
        member1.setGender(scanner.next().charAt(0));
        member1.setExisting(true);
        return member1;
    }

    public static long getId(){
        System.out.println("enter member id ");
        long membershipNumber=scanner.nextLong();
        return membershipNumber;
    }

    public static void removed(){
        System.out.println("member removed");
    }

    public static Member updateMember(long Membershipnumber){
        Member member=new Member();
        System.out.println("new name -- new age -- new gender:");
        member.setName(scanner.next());
        member.setAge(scanner.nextInt());
        member.setGender(scanner.next().charAt(0));
        member.setExisting(true);
        return member;
    }

    public static String getname(){
        System.out.println("enter the member name:");
        String name =scanner.next();
        return name;
    }

    public static void showByName(Member member){
        System.out.println(member.toString());
    }
}
