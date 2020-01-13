package ua.epam.javacore.lesson_15;


import java.sql.*;

public class StatementDemo {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/epam";

    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection;
        Statement statement;

        System.out.println("Registering JDBC driver...");
        Class.forName(JDBC_DRIVER);

        System.out.println("Connecting to database...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        System.out.println("Creating statement...");
        statement = connection.createStatement();

        String sql = "SELECT d.id, d.first_name, d.last_name, s.name AS specialty FROM developers d LEFT JOIN specialties s ON d.specialty_id = s.id;";


        Boolean isRetrieved = statement.execute(sql);

        System.out.println("Is data retrieved: " + isRetrieved);
        ResultSet resultSet = statement.executeQuery(sql);

        try {
            System.out.println("Displaying retrieved data:");

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
                System.out.println("\n===================\n");
            }

            System.out.println("Closing connection and releasing resources...");
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
        System.out.println("Thank You.");
    }
}