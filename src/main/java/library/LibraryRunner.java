package library;

import java.sql.SQLException;
import java.util.Scanner;

public class LibraryRunner {

    public static void main(String[] args) throws SQLException {

        LibraryService libraryService = new LibraryService();
        libraryService.entryMenu();

    }

}
