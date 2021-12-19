package com.company.controllermenu;

import com.company.service.BorrowedBookService;
import com.company.view.io.BorrowIo;
import com.company.view.menu.BorrowMenu;
import com.company.view.menu.LibraryMenu;

public class ControllerLibraryMenu {

        public static void ManageMenu() {
            ControllerMembermenu memberMenu = new ControllerMembermenu();
            ControllerBookmenu bookMenu = new ControllerBookmenu();
            boolean loop = true;
            while (loop) {
                int select = LibraryMenu.showMenu();
                switch (select) {
                    case 1:
                        memberMenu.ManageMember();
                        break;

                    case 2:
                        bookMenu.ManageBook();
                        break;

                    case 3:
                        loop = false;
                        System.exit(3);
                        break;

                }
            }
        }


}
