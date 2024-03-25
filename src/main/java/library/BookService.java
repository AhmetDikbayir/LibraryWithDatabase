package library;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static library.DatabaseConnection.con;
import static library.DatabaseConnection.st;

public class BookService {
    Scanner scan = new Scanner(System.in);

    public Book createBook() throws SQLException {
        System.out.println("Please enter the book ID : ");
        int bookID = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter the book name : ");
        String bookName = scan.nextLine();
        System.out.println("Please enter the author name : ");
        String authorName = scan.nextLine();
        System.out.println("Please enter the publisher name : ");
        String publisherName = scan.nextLine();
        System.out.println("Please enter the book year of publication : ");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter the book's page number : ");
        int pageNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter the book's genres : ");
        String genres = scan.next();
        Book book = new Book(bookName, authorName, year, pageNumber, genres);

        String sql = "INSERT INTO books VALUES(?,?,?,?,?,?,?)";
        PreparedStatement prst1 = con.prepareStatement(sql);
        prst1.setInt(1,bookID);
        prst1.setString(2,bookName);
        prst1.setString(3,authorName);
        prst1.setString(4,publisherName);
        prst1.setInt(5,year);
        prst1.setInt(6,pageNumber);
        prst1.setString(7,genres);
        prst1.executeUpdate();
        System.out.println("Book succesfully created");
        return book;

    }

    public void listBooks() throws SQLException {
        String bookListSQL = "SELECT * FROM books";
        ResultSet rs = st.executeQuery(bookListSQL);
        while (rs.next()){
            System.out.println(" Book ID : " + rs.getString("bookid") +
                    "\n Book Name : " + rs.getString("bookname") +
                    "\n Author : " + rs.getString("author") +
                    "\n Publisher : " + rs.getString("publisher") +
                    "\n Publish Year : " + rs.getInt("year") +
                    "\n Page Number : " + rs.getString("pagenumber") +
                    "\n Genres : " + rs.getString("genres")+
                    "\n-----------------------------------");

        }
    }
}
