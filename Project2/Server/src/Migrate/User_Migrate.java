package Migrate;

import Services.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class User_Migrate {

    //get connection from Services / ConnectDB class and return connection
    ConnectDB connectDB = new ConnectDB();
    Connection conn = connectDB.getConnection();
    public void createTableUser() {
        String sql = "CREATE TABLE IF NOT EXISTS `user` (\n" +
                "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `name` varchar(255) NOT NULL,\n" +
                "  `email` varchar(255) NOT NULL,\n" +
                "  `password` longtext NOT NULL,\n" +
                "  `address` varchar(255) ,\n" +
                "  `phone` varchar(255) ,\n" +
                "  `date` varchar(255),\n" +
                "  `code` varchar(255),\n" +
                "  `role` varchar(255) ,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        User_Migrate user_migrate = new User_Migrate();
        user_migrate.createTableUser();
    }
}
