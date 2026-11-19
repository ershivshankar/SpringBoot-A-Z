
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String URL =
        "jdbc:mysql://localhost:3306/user";

    
    private static final String Username = "root";
    private static final String Password = "Root@1234";

    public static Connection getConnection() throws SQLException {

        try {
            // Explicitly load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new SQLException(
                "MySQL JDBC Driver not found!", e
            );
        }

        return DriverManager.getConnection(
            URL,
            Username,
            Password
        );
    }
}
