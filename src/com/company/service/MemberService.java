package com.company.service;

import com.company.entity.Member;
import com.company.view.io.MemberIo;

import java.util.ArrayList;
import java.util.List;

public class MemberService implements CRUD<Member> {
    static long count=1;
    static List<Member> membersList=new ArrayList<>();

    @Override
    public Long add() {
        Member member= MemberIo.EnterInformation();
        member.setMembershipNumber(count);
        membersList.add(member);
        count++;
        return null;
    }

    @Override
    public Member show() {
        for(Member member:membersList){
            System.out.println(member);
        }
        return null;
    }

    @Override
    public void delete(long membershipNumber) {
        Member member1=new Member();
        for (Member member:membersList){
            if (member.getMembershipNumber()== membershipNumber) {
                member1=member;
                break;
            }
        }
        membersList.remove(member1);
        MemberIo.removed();
    }

    @Override
    public Member update(long membershipNumber) {
        for (Member member:membersList) {
            if (member.getMembershipNumber()== membershipNumber) {
                Member member2= MemberIo.updateMember(membershipNumber);
                member.setAge(member2.getAge());
                member.setName(member2.getName());
                member.setGender(member2.getGender());
            }
        }
        return null;
    }

    public static Member searchBymembershipNumber(long membershipNumber) {
        Member foundMember= new Member();
        for (Member member : membersList) {
            if (member.getMembershipNumber() == membershipNumber) {
                foundMember=member;
                System.out.println(member.toString());
                break;
            }
        }
        return foundMember;
    }

    public void searchByName(String name){
        for (Member member : membersList) {
            if (member.getName().equals(name)) {
                MemberIo.showByName(member);
            }
        }
    }
}
