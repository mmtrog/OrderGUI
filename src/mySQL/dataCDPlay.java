package mySQL;

import java.sql.*;

public class dataCDPlay {
    static final String DB_URL = "jdbc:mysql://localhost:3306/prj_aims";
    static final String USER = "root";
    static final String PASS = "Qu@nghuy123";
    static String QUERY = "SELECT title, length FROM tracklist WHERE id = ";

    public static String getData(String id) {
        String label = "ERROR: Exception occurs";
        String cdName = "";
        int count = 0;
        final String keyQuery = QUERY + id;
        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt2 = conn.createStatement();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(keyQuery);
                ResultSet rs2 = stmt2.executeQuery("select title from compactdisc where id =" + id + ";")
            ) 
            {
                if (rs2.next()) {
                    cdName = rs2.getString("title");
                }
                label = "CD: " + cdName + "\n";
                while (rs.next()) {
                    count ++;
                    label = label + "\n" + "Track " + count + ": " + rs.getString("title") + " (" + rs.getFloat("length") + ")";
                }
            } 
        catch (SQLException e) {
            System.out.println("Oops, error!");
            e.printStackTrace();
        }
        return label;   
    }

}
