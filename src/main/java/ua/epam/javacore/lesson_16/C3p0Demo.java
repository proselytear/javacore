package ua.epam.javacore.lesson_16;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Demo {
    private static ComboPooledDataSource cpds = new ComboPooledDataSource();

    static {
        try {
            cpds.setDriverClass("org.h2.Driver");
            cpds.setJdbcUrl("jdbc:h2:mem:test");
            cpds.setUser("root");
            cpds.setPassword("root");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }

    private C3p0Demo() {
    }
}
