package library;

import java.sql.*;
import java.util.Scanner;

public class Library {
    Scanner scan = new Scanner(System.in);
    Connection con = DriverManager.
            getConnection("jdbc:postgresql://localhost:5432/library", "techprodt", "password");

    Statement st = con.createStatement();


    public Library() throws SQLException {
    }



    public void createUser() throws SQLException {

        System.out.println("Please enter the member name : ");
        String name = scan.nextLine();
        System.out.println("Please enter the member lastname : ");
        String lastName = scan.nextLine();
        System.out.println("Please enter the member email address : ");
        String email = scan.nextLine();
        System.out.println("Please enter the member's phone number : ");
        String user_tel = scan.nextLine();
        System.out.println("User successfully added!!");


        System.out.println("success");
        String sql = "INSERT INTO users VALUES(?,?,?,?)";
        PreparedStatement prst1 = con.prepareStatement(sql);
        prst1.setString(1,name);
        prst1.setString(2,lastName);
        prst1.setString(3, email);
        prst1.setString(4,user_tel);
        prst1.executeUpdate();
        st.close();
        con.close();
    }

    public void deleteUser() throws SQLException {
        System.out.println("Pleae enter the user name:");
        String name = scan.nextLine();
        System.out.println("Please enter the member lastname : ");
        String lastName = scan.nextLine();
        String delSql = "DELETE FROM users WHERE userName = ? AND userLastname = ?";
        PreparedStatement prst2 = con.prepareStatement(delSql);
        prst2.setString(1,name);
        prst2.setString(2,lastName);
        prst2.executeUpdate();
        st.close();
        con.close();
    }
}
