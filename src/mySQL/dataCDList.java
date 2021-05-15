package mySQL;
import java.sql.*;
import media.disc.CompactDisc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class dataCDList{
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/prj_aims";
    static final String USER = "root";
    static final String PASS = "Qu@nghuy123";
    static final String QUERY = "SELECT id, title, category, director, artist, length, cost FROM compactdisc";

    public static ObservableList<CompactDisc> getData() {
        ObservableList<CompactDisc> list = FXCollections.observableArrayList();
        try(
            
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
                // Extract data from result set
                while (rs.next()) {
                    // Retrieve by column name
                    list.add(new CompactDisc(rs.getInt("id"), rs.getString("title"), rs.getString("category"), rs.getString("director"), rs.getString("artist"),rs.getFloat("length"), rs.getFloat("cost")));
                }
            } 
            catch (SQLException e) {
                System.out.println("Oops, error!");
                e.printStackTrace();
            }
        return list;
    }
}