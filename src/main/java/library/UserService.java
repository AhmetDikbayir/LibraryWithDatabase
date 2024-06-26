package library;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import static library.DatabaseConnection.con;
import static library.DatabaseConnection.st;

public class UserService {
    Scanner scan = new Scanner(System.in);

    public UserService() throws SQLException {
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


        String sql = "INSERT INTO users VALUES(?,?,?,?)";
        PreparedStatement prst1 = con.prepareStatement(sql);
        prst1.setString(1,name.toLowerCase());
        prst1.setString(2,lastName.toLowerCase());
        prst1.setString(3, email.toLowerCase());
        prst1.setString(4,user_tel);
        prst1.executeUpdate();
        prst1.close();

    }

    public void deleteUser() throws SQLException {
        System.out.println("Pleae enter the user name:");
        String name = scan.nextLine();
        System.out.println("Please enter the member lastname : ");
        String lastName = scan.nextLine();
        String delSql = "DELETE FROM users WHERE userName = ? AND userLastname = ?";
        PreparedStatement prst2 = con.prepareStatement(delSql);
        prst2.setString(1,name.toLowerCase());
        prst2.setString(2,lastName.toLowerCase());
        prst2.executeUpdate();
        prst2.close();
    }

    public void listUser() throws SQLException {
        String listUser = "SELECT * FROM users";
        ResultSet rs = st.executeQuery(listUser);

        while(rs.next()){
            System.out.println(" User Name : " + rs.getString("username") +
                    "\n User Lastname : " + rs.getString("userlastname") +
                    "\n User E-mail : " + rs.getString("useremail") +
                    "\n User Phone Number : " + rs.getString("usertel")+
                    "\n-----------------------------------");
        }
    }

    public void borrowBook(){

    }

}
