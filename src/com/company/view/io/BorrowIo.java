package com.company.view.io;

import com.company.entity.Book;
import com.company.entity.Borrow;
import com.company.entity.Member;
import com.company.service.BookService;
import com.company.service.MemberService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BorrowIo {
    static long count = 1;
    public static Scanner scanner =new Scanner(System.in);

    public static Borrow getBorrow(){
        Borrow borrow = new Borrow();
        Member member = MemberService.searchBymembershipNumber(MemberIo.getId());
        Book book = BookService.searchById(BookIo.getIdBook());
        if (member.getExisting() && book.getIsExistingBook()) {
            String dateFormat = "dd/MM/yyyy";
            System.out.println("enter return date with the formate dd/MM/yyyy");
            String returnDate = scanner.next();
            borrow.setBorrowed(true);
            borrow.setMember(member);
            borrow.setBook(book);
            book.setExistingBook(false);
            try {
                borrow.setReturnDate(new SimpleDateFormat(dateFormat).parse(returnDate));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
            return borrow;

    }

    public static void addBorrow(){
        System.out.println("your id is : " + count);
        count++;
    }

    public static long getId(){
        System.out.println("enter borrow id");
        long borrowId =scanner.nextLong();
        return borrowId;

    }

    public static void showBorrow(Borrow borrow){
        System.out.println(borrow);
    }
}
