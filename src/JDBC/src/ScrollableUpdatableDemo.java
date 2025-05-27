import java.sql.*;

public class ScrollableUpdatableDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "prensu17";

        try {
            // Load JDBC driver (optional)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected!");

            // Create scrollable, updatable statement
            Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE, 
                ResultSet.CONCUR_UPDATABLE
            );

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT ID, Name FROM city WHERE CountryCode='NPL'");

            // Move to last row
            rs.last();
            System.out.println("Last city: " + rs.getString("Name"));

            // Move to first row
            rs.first();
            System.out.println("First city: " + rs.getString("Name"));

            // Move to second row
            if (rs.absolute(2)) {
                System.out.println("Second city: " + rs.getString("Name"));

                // Let's update this city's name
                rs.updateString("Name", "UpdatedCityName");
                rs.updateRow();
                System.out.println("City name updated.");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
