package com.company.controllermenu;

import com.company.service.BorrowedBookService;
import com.company.view.io.BorrowIo;
import com.company.view.menu.BorrowMenu;

public class ControllerBorrowMenu {
    public static void manageBorrow(){
        BorrowedBookService borrowed= new BorrowedBookService();
        boolean loop=true;
        while (loop){
            int borrowselect= BorrowMenu.menuBorrow();
            switch (borrowselect){
                case 1:{
                    borrowed.borrowed();
                    break;
                }

                case 2:{
                    borrowed.returned(BorrowIo.getId());
                    break;
                }

                case 3:{
                    borrowed.showBorrowed();
                    break;
                }
                case 4:{
                    //     BorrowIo.showMessage();
                    borrowed.showNotReturn();
                    break;
                }

                case 5:{
                    loop = false;
                    ControllerBookmenu.ManageBook();
                    break;}

                case 6:{
                    System.exit(7);
                    break;}
            }
        }

    }
}
