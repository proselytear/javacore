package ua.epam.javacore.lesson_15;

// Step 1
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionExample {

    static final String DATABASE_URL = "jdbc:mysql://localhost/epam";

    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection;
        System.out.println("Registering JDBC driver...");

        // Step 2
        Class.forName("com.mysql.jdbc.Driver");

        System.out.println("Creating database connection...");
        // Step 3 + Step 4
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        connection.close();
    }
}
