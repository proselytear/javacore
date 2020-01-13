package ua.epam.javacore.lesson_15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApplicationExample {
    /**
     * JDBC Driver and database url
     */
    static final String DATABASE_URL = "jdbc:mysql://localhost/epam";

    /**
     * User and Password
     */
    static final String USER = "root";
    static final String PASSWORD = "root";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection;
        Statement statement;

        System.out.println("Registering JDBC driver...");

        Class.forName("com.mysql.jdbc.Driver");

        System.out.println("Creating database connection...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        System.out.println("Executing statement...");
        statement = connection.createStatement();

        String sql;
        sql = "SELECT d.id, d.first_name, d.last_name, s.name AS specialty FROM developers d LEFT JOIN specialties s ON d.specialty_id = s.id;";

        ResultSet resultSet = statement.executeQuery(sql);

        System.out.println("Retrieving data from database...");
        System.out.println("\nDevelopers:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String specialty = resultSet.getString("specialty");

            System.out.println("\n================\n");
            System.out.println("id: " + id);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Specialty: " + specialty);
        }

        System.out.println("Closing connection and releasing resources...");
        resultSet.close();
        statement.close();
        connection.close();
    }
}
