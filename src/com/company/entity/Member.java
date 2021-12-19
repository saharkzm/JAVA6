package com.company.entity;

public class Member {
    long membershipNumber;
    int age;
    String name;
    char gender;
    boolean existing;

    public Member() {
    }

    public long getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(long membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean getExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    @Override
    public String toString() {
        return "Member{" +
                "membershipNumber=" + membershipNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", existing=" + existing +
                '}';
    }
}
