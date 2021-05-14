package mySQL;

import java.sql.*;

public class dataDVDPlay {
    static final String DB_URL = "jdbc:mysql://localhost:3306/prj_aims";
    static final String USER = "root";
    static final String PASS = "Qu@nghuy123";
    static String QUERY = "SELECT title, length FROM digitalvideodisc WHERE id = ";

    public static String getData(String id) {
        String label = "DVD loading... ";
        final String keyQuery = QUERY + id;
        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(keyQuery);
            ) 
            {
               while (rs.next()) {
                    label = "DVD: " + rs.getString("title") + " (" + rs.getFloat("length") + ")";
               }
            } 
        catch (SQLException e) {
            System.out.println("Oops, error!");
            e.printStackTrace();
        }
        return label;
    }

}
