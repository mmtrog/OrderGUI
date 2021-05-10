import java.sql.*;

public class Test {
    static final String DB_URL = "jdbc:mysql://localhost:3306/prj_aims";
    static final String USER = "root";
    static final String PASS = "Qu@nghuy123";
    static final String QUERY = "SELECT id, title, category, authorslist, cost FROM book";

    public static void main(String[] args) {
        // Open a connection
        try(
            
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
                // Extract data from result set
                while (rs.next()) {
                    // Retrieve by column name
                    System.out.print("ID: " + rs.getInt("id"));
                    System.out.print(", Title: " + rs.getString("title"));
                    System.out.print(", Category: " + rs.getString("category"));
                    System.out.print(", Authors list: " + rs.getString("authorslist"));
                    System.out.println(", Cost: " + rs.getFloat("cost"));
                }
            } 
            catch (SQLException e) {
                System.out.println("Oops, error!");
                e.printStackTrace();
            } 
     }
}
