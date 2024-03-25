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

    public User createUser() throws SQLException {
        ArrayList<Book> bookListNull = new ArrayList<>();
        System.out.println("Please enter the member name : ");
        String name = scan.nextLine();
        System.out.println("Please enter the member lastname : ");
        String lastName = scan.nextLine();
        System.out.println("Please enter the member email address : ");
        String email = scan.nextLine();
        System.out.println("Please enter the member's phone number : ");
        String user_tel = scan.nextLine();
        System.out.println("User successfully added!!");
        User user = new User(name, lastName, email, user_tel, bookListNull);

        String sql = "INSERT INTO users VALUES(?,?,?,?)";
        PreparedStatement prst1 = con.prepareStatement(sql);
        prst1.setString(1,name);
        prst1.setString(2,lastName);
        prst1.setString(3, email);
        prst1.setString(4,user_tel);
        prst1.executeUpdate();

        return user;
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

    }

    public void listUser() throws SQLException {
        String listUser = "SELECT * FROM users";
        ResultSet rs = st.executeQuery(listUser);

        while(rs.next()){
            System.out.println(" User Name : " + rs.getString("username") +
                    "\n User Lastname : " + rs.getString("userlastname") +
                    "\n User E-mail : " + rs.getString("useremail") +
                    "\n User Phone Number : " + rs.getString("usertel"));

        }

    }

}
