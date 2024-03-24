package library;

import java.sql.*;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) throws SQLException {

        Library library1 = new Library();
        library1.createUser();



    }

    public void createUser() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the member name : ");
        String name = scan.nextLine();
        System.out.println("Please enter the member lastname : ");
        String lastName = scan.nextLine();
        System.out.println("Please enter the member email address : ");
        String email = scan.nextLine();
        System.out.println("Please enter the member's phone number : ");
        String user_tel = scan.nextLine();
        System.out.println("User successfully added!!");

        Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/library", "techprodt", "password");

        Statement st = con.createStatement();
        System.out.println("success");
        String sql = "INSERT INTO users VALUES(?,?,?,?)";
        PreparedStatement prst1 = con.prepareStatement(sql);
        prst1.setString(1,name);
        prst1.setString(2,lastName);
        prst1.setString(3, email);
        prst1.setString(4,user_tel);
        int updated = prst1.executeUpdate();
        System.out.println("updated = " + updated);
    }
}
