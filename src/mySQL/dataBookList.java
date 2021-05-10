package mySQL;
import java.sql.*;
import media.Book;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class dataBookList{
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/prj_aims";
    static final String USER = "root";
    static final String PASS = "Qu@nghuy123";
    static final String QUERY = "SELECT id, title, category, authorslist, cost FROM book";

    public static ObservableList<Book> getData() {
        ObservableList<Book> list = FXCollections.observableArrayList();
        try(
            
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
                // Extract data from result set
                while (rs.next()) {
                    // Retrieve by column name
                    list.add(new Book(rs.getInt("id"), rs.getString("title"), rs.getString("category"), rs.getFloat("cost"), rs.getString("authorslist")));
                }
            } 
            catch (SQLException e) {
                System.out.println("Oops, error!");
                e.printStackTrace();
            }
        return list;
    }
}