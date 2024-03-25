package library;

import java.sql.*;
import java.util.Scanner;

public class Library {

    Book book = new Book();
    User user1 = new User();

    public Library() {
    }

    public Library(Book book) {
        this.book = book;
    }

    public Library(Book book, User user1) {
        this.book = book;
        this.user1 = user1;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }


}
