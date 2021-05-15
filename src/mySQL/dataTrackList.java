package mySQL;

import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import media.disc.Track;

public class dataTrackList {
    static final String DB_URL = "jdbc:mysql://localhost:3306/prj_aims";
    static final String USER = "root";
    static final String PASS = "Qu@nghuy123";
    static String QUERY = "SELECT id, title, length FROM tracklist";

    public static ObservableList<Track> getData() {
        ObservableList<Track> list = FXCollections.observableArrayList();
        try(
            
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
                // Extract data from result set
                while (rs.next()) {
                    // Retrieve by column name
                    list.add(new Track(rs.getInt("id"), rs.getString("title"), rs.getFloat("length")));
                }
            } 
            catch (SQLException e) {
                System.out.println("Oops, error!");
                e.printStackTrace();
            }
        return list;
    }

}
