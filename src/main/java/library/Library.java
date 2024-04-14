package library;

import java.sql.*;
import java.util.Scanner;

public class Library {

    Book book = new Book();
//    User user1 = new User();

    public Library() {
    }

    public Library(Book book) {
        this.book = book;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
