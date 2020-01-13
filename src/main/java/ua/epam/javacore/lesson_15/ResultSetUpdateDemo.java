package ua.epam.javacore.lesson_15;

import java.sql.*;

public class ResultSetUpdateDemo {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/epam";

    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection;
        Statement statement = null;

        Class.forName(JDBC_DRIVER);

        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        System.out.println("Creating statement...");

        try {
            statement = connection.createStatement(
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE
            );
            String sql = "SELECT * FROM developers;";
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Initial list of records:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                System.out.println("Last record in result set:");
                System.out.println("id: " + id);
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);
                System.out.println("\n===================\n");
            }

            System.out.println("Updating all developer's last_name (to UPPER CASE)...");
            resultSet.first();
            while (resultSet.next()) {
                String newLastName = resultSet.getString("last_name").toUpperCase();
                resultSet.updateString("last_name", newLastName);
                resultSet.updateRow();
            }

            resultSet.first();
            System.out.println("Final list of records:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                System.out.println("Last record in result set:");
                System.out.println("id: " + id);
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);
                System.out.println("\n===================\n");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}