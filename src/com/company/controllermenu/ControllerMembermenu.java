package com.company.controllermenu;

import com.company.service.MemberService;
import com.company.view.io.MemberIo;
import com.company.view.menu.MemberMenu;

public class ControllerMembermenu {
    static long count=1;
    public void ManageMember() {
        MemberService memberService=new MemberService();
        boolean loop=true;
        while (loop){
            int memberSelect= MemberMenu.MenuMember();
            switch (memberSelect){
                case 1:{
                    System.out.println("your id is : " + count);
                    memberService.add();
                    break;}

                case 2:
                    memberService.show();
                    break;

                case 3:{
                    memberService.delete(MemberIo.getId());

                    break;
                }

                case 4:
                    memberService.update(MemberIo.getId());
                    break;

                case 5:{
                    memberService.searchBymembershipNumber(MemberIo.getId());
                    break;}

                case 6:{

                    memberService.searchByName(MemberIo.getname());
                    break;
                }

                case 7:
                    loop = false;
                    ControllerLibraryMenu.ManageMenu();
                    break;

                case 8:
                    System.exit(7);
                    break;

            }
        }
    }
}
