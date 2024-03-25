package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryService {

    Library library1 = new Library();

    public LibraryService() throws SQLException {
    }

    public void entryMenu() throws SQLException {
        Scanner scan = new Scanner(System.in);
        UserService userService = new UserService();
        BookService bookService = new BookService();
        int select =0;
        do{
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/library", "techprodt", "password");
            Statement st = con.createStatement();
            String bookTableSQL = "CREATE TABLE IF NOT EXISTS books(" +
                    "bookId INTEGER," +
                    "bookName VARCHAR(50)," +
                    "author VARCHAR(50)," +
                    "publisher VARCHAR(30)," +
                    "year INTEGER," +
                    "pageNumber INTEGER," +
                    "genres VARCHAR(20));";
            st.execute(bookTableSQL);

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
                case 1:
                    userService.listUser();
                    break;
                case 2:
                    bookService.listBooks();
                    break;
                case 3:
                    userService.createUser();
                    break;
                case 4:
                    userService.deleteUser();
                    break;
                case 5:
                    bookService.createBook();
                    break;
                case 0:
                    System.out.println("Thank you for prefering our library\n" +
                            "Have a nice day!\n" +
                            "Happy Reading!!");

            }
            st.close();
            con.close();
        }while (select !=0);

    }
}
