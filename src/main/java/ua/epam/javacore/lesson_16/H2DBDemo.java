package ua.epam.javacore.lesson_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class H2DBDemo {

    public static void main(String[] args) {

        String url = "jdbc:h2:mem:testdb";
        String user = "sa";
        String passwd = "";
        String query = "SELECT * FROM cars";
        String ddlQuery = "CREATE TABLE cars(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), price INT);" +
                "INSERT INTO cars(name, price) VALUES('Audi', 52642);" +
                "INSERT INTO cars(name, price) VALUES('Mercedes', 57127);" +
                "INSERT INTO cars(name, price) VALUES('Skoda', 9000);" +
                "INSERT INTO cars(name, price) VALUES('Volvo', 29000);" +
                "INSERT INTO cars(name, price) VALUES('Bentley', 350000);" +
                "INSERT INTO cars(name, price) VALUES('Citroen', 21000);" +
                "INSERT INTO cars(name, price) VALUES('Hummer', 41400);" +
                "INSERT INTO cars(name, price) VALUES('Volkswagen', 21600);";

        try {
            Connection con = DriverManager.getConnection(url, user, passwd);
            Statement st = con.createStatement();
            int i = st.executeUpdate(ddlQuery);
            System.out.println(i);
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(H2DBDemo.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        try (Connection con = DriverManager.getConnection(url, user, passwd);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {

                System.out.printf("%d %s %d%n", rs.getInt(1),
                        rs.getString(2), rs.getInt(3));
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(H2DBDemo.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}