import java.sql.*;

public class Lab08 {
    // Database credentials
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/world";
    static final String USER = "root";         
    static final String PASSWORD = "prensu17";  

    public static void main(String[] args) {
        try {
            // 1. Load JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("Connected to database.");

            // 3. Create - Insert a record
            String insertSql = "INSERT INTO students (firstname, lastname, age) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSql);
            pstmt.setString(1, "Prensu");
            pstmt.setString(2, "Dangol");
            pstmt.setInt(3, 22);
            int rowsInserted = pstmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

            // 4. Read - Select all records
            String selectSql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectSql);
            System.out.println("Students table:");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("firstname") + " | " +
                    rs.getString("lastname") + " | " +
                    rs.getInt("age")
                );
            }

            // 5. Update - Update a record
            String updateSql = "UPDATE students SET age = ? WHERE firstname = ?";
            pstmt = conn.prepareStatement(updateSql);
            pstmt.setInt(1, 23);
            pstmt.setString(2, "John");
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);

            // 6. Delete - Delete a record
            String deleteSql = "DELETE FROM students WHERE firstname = ?";
            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setString(1, "John");
            int rowsDeleted = pstmt.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);

            // 7. Close resources
            rs.close();
            stmt.close();
            pstmt.close();
            conn.close();
            System.out.println("Disconnected from database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



