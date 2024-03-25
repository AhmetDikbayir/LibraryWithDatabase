package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryRunner {

    public static void main(String[] args) throws SQLException {

        LibraryService libraryService = new LibraryService();
        libraryService.entryMenu();
    }

}
