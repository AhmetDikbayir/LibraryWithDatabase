package library;

import java.util.ArrayList;

public class User {

    private int id;
    private String name;
    private String lastName;
    private String email;
    private String user_tel;
    private ArrayList<Book> bookList;


    public User(int id, String name, String lastName, String email, String user_tel, ArrayList<Book> bookList) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.user_tel = user_tel;
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(Book book) {
        this.bookList.add(book);
    }

    @Override
    public String toString() {
        return "User : \n" +
                "User Name : " + name +"\n" +
                "User Lastname : " + lastName +"\n" +
                "User Email : " + email + "\n" +
                "User Phone : " + user_tel + "\n" +
                "User Booklist : " + bookList + "\n"+
                "-------------------------------------" + "\n";
    }
}
