package Services;

import Models.Message;
import Models.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VehicleService {
    //get Connection from ConnectDB class and return connection
    ConnectDB connectDB = new ConnectDB();
    Connection conn = connectDB.getConnection();
    ///get All attribute from database and return list of vehicle
    //Object Vehicle with id,name,color,type,date,seat_capacity,capacity,brand

    //insert vehicle input object vehicle and return true if success else return false
    public Message insertVehicle(Vehicle vehicle) {
        Message message = new Message();

        try {
            String sql = "INSERT INTO vehicle(`name`, `color`, `type`, `date`, `seat_capacity`, `capacity`, `brand`) VALUES(?,?,?,?,?,?,?)";
          PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, vehicle.getName());
            pst.setString(2, vehicle.getColor());
            pst.setString(3, vehicle.getType());
            pst.setString(4, vehicle.getDate());
            pst.setString(5, vehicle.getSeat_capacity());
            pst.setString(6, vehicle.getCapacity());
            pst.setString(7, vehicle.getBrand());
            pst.executeUpdate();
            message.setMessage("Thêm phương tiện thành công!");
            message.setCheck(true);
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            message.setMessage("Có lỗi xảy ra!");
            message.setCheck(false);
            return message;
        }
    }
    //update vehicle input object vehicle and return true if success else return false
    public Message updateVehicle(Vehicle vehicle) {
        Message message = new Message();
        try {
            String sql = "UPDATE vehicle SET `name`=?, `color`=?, `type`=?, `date`=?, `seat_capacity`=?, `capacity`=?, `brand`=? WHERE `id`=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, vehicle.getName());
            pst.setString(2, vehicle.getColor());
            pst.setString(3, vehicle.getType());
            pst.setString(4, vehicle.getDate());
            pst.setString(5, vehicle.getSeat_capacity());
            pst.setString(6, vehicle.getCapacity());
            pst.setString(7, vehicle.getBrand());
            pst.setInt(8, vehicle.getId());
            pst.executeUpdate();
            message.setMessage("Sửa phương tiện thành công!");
            message.setCheck(true);
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            message.setMessage("Có lỗi xảy ra!");
            message.setCheck(false);
            return message;
        }
    }
    //delete vehicle input object vehicle and return true if success else return false
    public Message deleteVehicle(Vehicle vehicle) {
        Message message = new Message();
        //check in manage_vehicle has vehicle where id_vehicle = id  if has return false
        try {
            String sql = "SELECT * FROM manage_vehicle WHERE vehicle_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, vehicle.getId());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                message.setMessage("Phương tiện này đang được sử dụng, không thể xóa!");
                message.setCheck(false);
                return message;
            } else {
                sql = "DELETE FROM vehicle WHERE id = ?";
                pst = conn.prepareStatement(sql);
                pst.setInt(1, vehicle.getId());
                pst.executeUpdate();
                message.setMessage("Xóa phương tiện thành công!");
                message.setCheck(true);
                return message;
            }
        } catch (Exception e) {
            e.printStackTrace();
            message.setMessage("Có lỗi xảy ra!");
            message.setCheck(false);
            return message;
        }

    }
    //get ArrayList of vehicle from database and return list of vehicle
    ///phần này chắc em hiểu nhở
    public ArrayList<Vehicle> getAllVehicle() {
        ArrayList<Vehicle> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM vehicle";
            PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vehicle vehicle = new Vehicle();
                vehicle.setId(rs.getInt("id"));
                vehicle.setName(rs.getString("name"));
                vehicle.setColor(rs.getString("color"));
                vehicle.setType(rs.getString("type"));
                vehicle.setDate(rs.getString("date"));
                vehicle.setSeat_capacity(rs.getString("seat_capacity"));
                vehicle.setCapacity(rs.getString("capacity"));
                vehicle.setBrand(rs.getString("brand"));
                list.add(vehicle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    //get vehicle by id input vehicle Object and return vehicle
    public Vehicle getVehicleById(Vehicle vehicle) {
        try {
            String sql = "SELECT * FROM vehicle WHERE `id`=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, vehicle.getId());
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                vehicle.setId(rs.getInt("id"));
                vehicle.setName(rs.getString("name"));
                vehicle.setColor(rs.getString("color"));
                vehicle.setType(rs.getString("type"));
                vehicle.setDate(rs.getString("date"));
                vehicle.setSeat_capacity(rs.getString("seat_capacity"));
                vehicle.setCapacity(rs.getString("capacity"));
                vehicle.setBrand(rs.getString("brand"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vehicle;
    }
    //get vehicle input id and return vehicle
    public Vehicle getVehicleById(int id) {
        Vehicle vehicle = new Vehicle();
        try {
            String sql = "SELECT * FROM vehicle WHERE `id`=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                vehicle.setId(rs.getInt("id"));
                vehicle.setName(rs.getString("name"));
                vehicle.setColor(rs.getString("color"));
                vehicle.setType(rs.getString("type"));
                vehicle.setDate(rs.getString("date"));
                vehicle.setSeat_capacity(rs.getString("seat_capacity"));
                vehicle.setCapacity(rs.getString("capacity"));
                vehicle.setBrand(rs.getString("brand"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vehicle;
    }
    //search vehicle by all attribute input string and return list of vehicle
    public ArrayList<Vehicle> searchVehicle(String search) {
        ArrayList<Vehicle> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM vehicle WHERE `name` LIKE '%" + search + "%' OR `color` LIKE '%" + search + "%' OR `type` LIKE '%" + search + "%' OR `date` LIKE '%" + search + "%' OR `seat_capacity` LIKE '%" + search + "%' OR `capacity` LIKE '%" + search + "%' OR `brand` LIKE '%" + search + "%' + OR `id` LIKE '%" + search + "%'";
            PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Vehicle vehicle = new Vehicle();
                vehicle.setId(rs.getInt("id"));
                vehicle.setName(rs.getString("name"));
                vehicle.setColor(rs.getString("color"));
                vehicle.setType(rs.getString("type"));
                vehicle.setDate(rs.getString("date"));
                vehicle.setSeat_capacity(rs.getString("seat_capacity"));
                vehicle.setCapacity(rs.getString("capacity"));
                vehicle.setBrand(rs.getString("brand"));
                list.add(vehicle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }




}

