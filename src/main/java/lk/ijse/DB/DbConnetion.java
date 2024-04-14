package lk.ijse.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnetion {
    public static DbConnection getInstance;
    private static DbConnection instance;


    public static void setInstance(DbConnection instance) {
        DbConnetion.instance = instance;
    }

    public static DbConnection getInstance() {
        return null;
    }


    public class DbConnection {
        private static DbConnection dbConnection;
        private Connection connection;

        private DbConnection() throws SQLException {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/FOOD_COURT_RESTAURENT",
                    "root",
                    "Ijse@123"
            );
        }
        public static DbConnection getInstance() throws SQLException {
            if(dbConnection == null) {
            }
            return dbConnection;
        }

        public Connection getConnection() {
            return connection;
        }
    }

}
