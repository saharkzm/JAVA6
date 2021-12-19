package com.company.controllermenu;

import com.company.service.BookService;
import com.company.view.io.BookIo;
import com.company.view.menu.BookMenu;

public class ControllerBookmenu {
    public static void ManageBook() {
        BookService bookService=new BookService();
        boolean loop=true;
        while (loop){
            int bookSelect= BookMenu.menuBook();
            switch (bookSelect){
                case 1:{
                    bookService.add();
                    break;
                }

                case 2:
                    bookService.show();
                    break;

                case 3:{
                    bookService.delete(BookIo.getIdBook());
                    break;
                }

                case 4:{
                    bookService.update(BookIo.getIdBook());
                    break;
                }

                case 5:{
                    bookService.searchById(BookIo.getIdBook());
                    break;}

                case 6:
                    bookService.searchByName(BookIo.getname());
                    break;

                case 7:
                    ControllerBorrowMenu.manageBorrow();
                    break;

                case 8:
                    loop = false;
                    ControllerLibraryMenu.ManageMenu();
                    break;

                case 9:
                    System.exit(11);
                    break;


            }
        }
    }
}
