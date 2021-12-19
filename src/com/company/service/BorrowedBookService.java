package com.company.service;
import com.company.entity.Borrow;
import com.company.view.io.BorrowIo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class BorrowedBookService {
    static List<Borrow> borrowedlist = new ArrayList<>();
    static long count = 1;

    public void borrowed() {
        Borrow borrow = BorrowIo.getBorrow();
        borrow.setBorrowId(count);
        borrowedlist.add(borrow);
        count++;
        BorrowIo.addBorrow();
    }

    public void returned(long id) {
        for (Borrow borrow : borrowedlist) {
            if(borrow.getBorrowId()==id){
            borrow.setBorrowed(false);}
            BorrowIo.showBorrow(borrow);
        }
    }

    public void showBorrowed() {
        for (Borrow borrow : borrowedlist) {
            BorrowIo.showBorrow(borrow);

        }
    }

    public static void showNotReturn() {
        LocalDate dateNow = LocalDate.now();
        LocalDate date;
        for (Borrow borrow1 : borrowedlist) {
            date = borrow1.getReturnDate().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
            if (dateNow.isAfter(date)) {
                BorrowIo.showBorrow(borrow1);
            }
        }
    }
}
