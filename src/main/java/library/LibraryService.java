package library;

import java.sql.SQLException;
import java.util.Scanner;

public class LibraryService {

    Library library1 = new Library();

    public LibraryService() throws SQLException {
    }

    public void entryMenu() throws SQLException {
        Scanner scan = new Scanner(System.in);
        int select =0;
        do{
            System.out.println("Welcome Ancient Magnificient Library");
            System.out.println("Select what do you want to do?\n" +
                    "1 ==> List Users\n" +
                    "2 ==> List Books\n" +
                    "3 ==> Save Member\n" +
                    "4 ==> Delete User\n" +
                    "5 ==> Add Book\n" +
                    "6 ==> Give Book to User\n" +
                    "7 ==> Get Back Book from User\n" +
                    "0 ==> EXIT");
            select = scan.nextInt();
            //System.out.println();
            switch (select){
//                case 1:
//                    library1.createUser();
//                    break;
//                case 2:
//                    library1.deleteUser();
//                    break;
                case 3:
                    library1.createUser();
                    break;
                case 4:
                    library1.deleteUser();
                    break;
//                case 5:
//                    userService.borrowBook();
//                    break;
                case 0:
                    System.out.println("Thank you for prefering our library\n" +
                            "Have a nice day!\n" +
                            "Happy Reading!!");

            }
        }while (select !=0);
    }
}
