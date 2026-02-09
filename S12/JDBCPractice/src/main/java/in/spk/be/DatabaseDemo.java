package in.spk.be;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemo {

    private static final String URL = "jdbc:postgresql://localhost:5432/testdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "";

    private static final String CREATE_TABLE_SQL =
            "CREATE TABLE IF NOT EXISTS students (" +
                    "id SERIAL PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "grade VARCHAR(10))";

    private static final String INSERT_STUDENT_SQL =
            "INSERT INTO students (name, grade) VALUES (?, ?)";

    private static final String DELETE_STUDENT_SQL =
            "DELETE FROM students WHERE name = ?";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connected to PostgreSQL successfully!");

            try (Statement stmt = conn.createStatement()) {
                stmt.execute(CREATE_TABLE_SQL);
                System.out.println("Table 'students' is ready.");
            }

            try (PreparedStatement pstmt = conn.prepareStatement(INSERT_STUDENT_SQL)) {

                // Student 1
                pstmt.setString(1, "Alice");
                pstmt.setString(2, "A+");
                pstmt.addBatch();

                // Student 2
                pstmt.setString(1, "Bob");
                pstmt.setString(2, "B");
                pstmt.addBatch();

                // Student 3
                pstmt.setString(1, "Charlie");
                pstmt.setString(2, "A");
                pstmt.addBatch();

                int[] rowsInserted = pstmt.executeBatch();
                System.out.println("Batch inserted " + rowsInserted.length + " students.");
            }

            // 3. DELETE: Remove a specific entry
            try (PreparedStatement pstmt = conn.prepareStatement(DELETE_STUDENT_SQL)) {
                pstmt.setString(1, "Bob");
                int rowsDeleted = pstmt.executeUpdate();
                System.out.println("Deleted " + rowsDeleted + " student(s) named 'Bob'.");
            }

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}