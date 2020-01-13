package ua.epam.javacore.lesson_15;

import java.sql.*;

public class ResultSetViewDemo {
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
            String sql = "SELECT d.id, d.first_name, d.last_name, s.name AS specialty FROM developers d LEFT JOIN specialties s ON d.specialty_id = s.id;";
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Moving cursor to the last position...");
            resultSet.last();

            System.out.println("Getting record (by name)...");
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String specialty = resultSet.getString("specialty");


            System.out.println("Last record in result set:");
            System.out.println("id: " + id);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Specialty: " + specialty);
            System.out.println("\n=========================\n");

            System.out.println("Moving cursor to previous row...");
            resultSet.previous();

            System.out.println("Getting record...");
            id = resultSet.getInt("id");
            firstName = resultSet.getString("first_name");
            lastName = resultSet.getString("last_name");
            specialty = resultSet.getString("specialty");

            System.out.println("Previous record:");
            System.out.println("id: " + id);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Specialty: " + specialty);
            System.out.println("\n=========================\n");


            System.out.println("Moving cursor to the first row...");
            resultSet.first();

            System.out.println("Getting record...");
            id = resultSet.getInt("id");
            firstName = resultSet.getString("first_name");
            lastName = resultSet.getString("last_name");
            specialty = resultSet.getString("specialty");

            System.out.println("First record:");
            System.out.println("id: " + id);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Specialty: " + specialty);
            System.out.println("\n=========================\n");

            System.out.println("Adding record...");
            sql = "INSERT INTO developers VALUES (9, 'Mike', 'Mikeson', 2)";
            statement.executeUpdate(sql);

            sql = "SELECT d.id, d.first_name, d.last_name, s.name AS specialty FROM developers d LEFT JOIN specialties s ON d.specialty_id = s.id;";
            resultSet = statement.executeQuery(sql);
            resultSet.last();

            System.out.println("Getting record (by index)...");
            id = resultSet.getInt(1);
            firstName = resultSet.getString(2);
            lastName = resultSet.getString(3);
            specialty = resultSet.getString(4);

            System.out.println("Last record:");
            System.out.println("id: " + id);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Specialty: " + specialty);
            System.out.println("\n=========================\n");


            System.out.println("Full list of records (by name):");
            sql = "SELECT d.id, d.first_name, d.last_name, s.name AS specialty FROM developers d LEFT JOIN specialties s ON d.specialty_id = s.id;";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                firstName = resultSet.getString("first_name");
                lastName = resultSet.getString("last_name");
                specialty = resultSet.getString("specialty");

                System.out.println("id: " + id);
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);
                System.out.println("Specialty: " + specialty);
                System.out.println("\n=========================\n");


            }
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
