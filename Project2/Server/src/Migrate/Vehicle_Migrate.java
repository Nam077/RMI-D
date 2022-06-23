package Migrate;

import Services.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class Vehicle_Migrate {
    //get connection from Services / ConnectDB class and return connection
    ConnectDB connectDB = new ConnectDB();
    Connection conn = connectDB.getConnection();
    public boolean createTableVehicle() {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS vehicle (id  int primary key auto_increment , name varchar(255), color varchar(255), type varchar(255), date varchar(255), seat_capacity varchar(255), capacity varchar(255), brand varchar(255))";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        Vehicle_Migrate vehicle_migrate = new Vehicle_Migrate();
        vehicle_migrate.createTableVehicle();
    }
}
