package Services;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectDB {
    public static String nameDatabase = "java";
    public static String userDatabase = "root";
    public static String passDatabase = "";
    private static String DB_URL = "jdbc:mysql://localhost:3306/"+nameDatabase;
    public static Connection getConnection() {
        Connection conn = null;
        try {
            String username = userDatabase;
            String password = passDatabase;
            conn = DriverManager.getConnection(DB_URL, username , password);
            System.out.println("Kết nối thành công");
        } catch (Exception ex) {
            System.out.println("Kêt nối thất bại!");
            ex.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.getConnection();

    }
}
