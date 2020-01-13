package ua.epam.javacore.lesson_15;

import java.sql.*;

public class PreparedStatementDemo {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/epam";

    static final String USER = "root";
    static final String PASSWORD = "root";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection;
        PreparedStatement preparedStatement = null;

        System.out.println("Registering JDBC driver...");
        Class.forName(JDBC_DRIVER);

        System.out.println("Creating connection...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);


        try {
            String sql = "SELECT d.id, d.first_name, d.last_name, s.name AS specialty FROM developers d LEFT JOIN specialties s ON d.specialty_id = s.id;";
            preparedStatement = connection.prepareStatement(sql);
            System.out.println("Initial developers table content:");
            ResultSet resultSet = preparedStatement.executeQuery(sql);
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

            sql = "UPDATE developers SET last_name = ? WHERE id = ?";
            System.out.println("Creating statement...");
            System.out.println("Executing SQL query...");

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "IVANOV_UPDATED");
            preparedStatement.setInt(2, 5);


            System.out.println("Rows impacted: " + preparedStatement.executeUpdate());

            System.out.println("Final developers table content:");
            sql = "SELECT d.id, d.first_name, d.last_name, s.name AS specialty FROM developers d LEFT JOIN specialties s ON d.specialty_id = s.id;";
            resultSet = preparedStatement.executeQuery(sql);
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
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        System.out.println("Thank You.");
    }
}
