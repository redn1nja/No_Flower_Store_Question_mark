package task2.singleton;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    @SneakyThrows
    private DBConnection(){
        connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
    }

    @SneakyThrows
    public void executeQuery(String query){
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
    }

    public static DBConnection getInstance(){
        if(dbConnection==null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
