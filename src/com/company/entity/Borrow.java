package com.company.entity;

import java.util.Date;

public class Borrow {
    private long borrowId;
    private boolean borrowed;
    private Date returnDate;
    private Member member;
    private Book book;

    public Borrow() {
    }

    public Borrow(Date returnDate, Member member, Book book) {
        this.returnDate = returnDate;
        this.member = member;
        this.book = book;
    }

    public long getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(long borrowId) {
        this.borrowId = borrowId;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "borrowId=" + borrowId +
                ", borrowed=" + borrowed +
                ", returnDate=" + returnDate +
                ", member=" + member +
                ", book=" + book +
                '}';
    }
}
