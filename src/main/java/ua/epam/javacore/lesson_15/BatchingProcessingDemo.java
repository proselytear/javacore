package ua.epam.javacore.lesson_15;

import java.sql.*;

public class BatchingProcessingDemo {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/epam";

    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection;
        Statement statement;

        Class.forName(JDBC_DRIVER);
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        connection.setAutoCommit(false);

        statement = connection.createStatement();

        String sql = "SELECT * FROM developers";
        ResultSet resultSet = statement.executeQuery(sql);


        System.out.println("Initial developer's table content:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");

            System.out.println("\n====================");
            System.out.println("id: " + id);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("====================\n");
        }

        sql = "INSERT INTO developers VALUES (101, 'TEST_FIRST_NAME_1', 'TEST_LAST_NAME_1', 1)";
        statement.addBatch(sql);
        sql = "INSERT INTO developers VALUES (102, 'TEST_FIRST_NAME_2', 'TEST_LAST_NAME_2', 2)";
        statement.addBatch(sql);
        sql = "INSERT INTO developers VALUES (103, 'TEST_FIRST_NAME_3', 'TEST_LAST_NAME_3', 3)";
        statement.addBatch(sql);

        try {


            statement.executeBatch();
            connection.commit();

            sql = "SELECT * FROM developers";
            resultSet = statement.executeQuery(sql);

            System.out.println("Final developer's table content:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                System.out.println("\n====================");
                System.out.println("id: " + id);
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);
                System.out.println("====================\n");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } finally {
            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }

        System.out.println("Thank You.");
    }
}
