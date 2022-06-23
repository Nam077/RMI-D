package Migrate;

import Services.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Manage_Vehicle_Migrate {
    //get connection from Services / ConnectDB class and return connection
    ConnectDB connectDB = new ConnectDB();
    Connection conn = connectDB.getConnection();

    //create table ManageVehicle
    public boolean createTableManageVehicle() {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS manage_vehicle (id  int primary key auto_increment , user_id int, name varchar(255), vehicle_id int, date varchar(255), plate varchar(255), engine_no varchar(255), chassis_no varchar(255))";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        //run createTableManage() method
        Manage_Vehicle_Migrate manage_Vehicle_migrate = new Manage_Vehicle_Migrate();
        manage_Vehicle_migrate.createTableManageVehicle();
    }
}
