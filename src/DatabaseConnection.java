import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://s13.winhost.com;databaseName=DB_97346_trilunarsoft;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "DB_97346_trilunarsoft_user";
    private static final String PASSWORD = "lunar123!";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}

