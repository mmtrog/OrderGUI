package mySQL;

import java.sql.*;

public class dataBookContent {
    static final String DB_URL = "jdbc:mysql://localhost:3306/prj_aims";
    static final String USER = "root";
    static final String PASS = "Qu@nghuy123";
    static String QUERY = "SELECT content FROM book WHERE title = ";

    public static String getData(String bookName) {
        String content = "Book don't exist";
        final String keyQuery = QUERY +  "'" + bookName + "';";
        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(keyQuery);
            ) 
            {
               while (rs.next()) {
                    content = rs.getString("content");
               }
            } 
        catch (SQLException e) {
            System.out.println("Oops, error!");
            e.printStackTrace();
        }
        return content;
    }

}
