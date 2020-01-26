import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    private static final String urlDataBase = "jdbc:mysql://localhost:3306/books?useSSL=false";
    private static final String login = "root";
    private static final String password = "PASS";

    public static void main(String[] args) {
        Connection connection;


        try {
            try {
                FabricMySQLDriver driver = new FabricMySQLDriver();
                DriverManager.registerDriver(driver);

                connection = DriverManager.getConnection(urlDataBase, login, password);
                if(!connection.isClosed()){
                    System.out.println("Установленно соединеие");
                }
                connection.close();
            } catch (SQLException e) {
                System.out.println("не удалось подключиться ");
            }
        }finally {

        }
    }
}
