package Services;

import Models.ManageVehicle;
import Models.Message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class
ManageVehicleService {
    //get connection from ConnectDB class and return connection
    ConnectDB connectDB = new ConnectDB();
    Connection conn = connectDB.getConnection();
    int id;
    int user_id;
    String name;
    int vehicle_id;
    String date;
    String plate;
    String engine_no;
    String chassis_no;
   //ManageVehicle object with id, user_id, name, vehicle_id, date, plate, engine_no, chassis_no
    //insert ManageVehicle input ManageVehicle object
    public Message insertManageVehicle(ManageVehicle manageVehicle) {
        Message message = new Message();
        if(checkPlate(manageVehicle.getPlate())){
            message.setMessage("Biển số đã tồn tại!");
            message.setCheck(false);
            return message;
        }
        try {
            String sql = "INSERT INTO manage_vehicle (user_id, name, vehicle_id, date, plate, engine_no, chassis_no) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, manageVehicle.getUser_id());
            pst.setString(2, manageVehicle.getName());
            pst.setInt(3, manageVehicle.getVehicle_id());
            pst.setString(4, manageVehicle.getDate());
            pst.setString(5, manageVehicle.getPlate());
            pst.setString(6, manageVehicle.getEngine_no());
            pst.setString(7, manageVehicle.getChassis_no());
            pst.executeUpdate();
            message.setMessage("Đăng ký thành công!");
            message.setCheck(true);
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            message.setMessage("Có lỗi xảy ra!");
            message.setCheck(false);
            return message;
        }

    }
    //check Plate exist or not
    public boolean checkPlate(String plate) {
        try {
            String sql = "SELECT * FROM manage_vehicle WHERE plate = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, plate);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //delete ManageVehicle input object ManageVehicle
    public Message deleteManageVehicle(ManageVehicle manageVehicle) {
        Message message = new Message();

        try {
            String sql = "DELETE FROM manage_vehicle WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, manageVehicle.getId());
            pst.executeUpdate();
            message.setMessage("Xóa đăng ký thành công!");
            message.setCheck(true);
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            message.setMessage("Có lỗi xảy ra!");
            message.setCheck(false);
            return message;
        }
    }
    //update ManageVehicle input object ManageVehicle
    public Message updateManageVehicle(ManageVehicle manageVehicle) {
    	ManageVehicle manageVehicleCheck = getManageVehicleById(manageVehicle.getId());
        Message message = new Message();
        if(checkPlate(manageVehicle.getPlate()) && !manageVehicleCheck.getPlate().equals(manageVehicle.getPlate())){
            message.setMessage("Biển số đã tồn tại!");
            message.setCheck(false);
            return message;
        }
        try {
            String sql = "UPDATE manage_vehicle SET user_id = ?, name = ?, vehicle_id = ?, date = ?, plate = ?, engine_no = ?, chassis_no = ? WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, manageVehicle.getUser_id());
            pst.setString(2, manageVehicle.getName());
            pst.setInt(3, manageVehicle.getVehicle_id());
            pst.setString(4, manageVehicle.getDate());
            pst.setString(5, manageVehicle.getPlate());
            pst.setString(6, manageVehicle.getEngine_no());
            pst.setString(7, manageVehicle.getChassis_no());
            pst.setInt(8, manageVehicle.getId());
            pst.executeUpdate();
            message.setMessage("Cập nhật đăng ký thành công!");
            message.setCheck(true);
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            message.setMessage("Có lỗi xảy ra!");
            message.setCheck(false);
            return message;
        }
    }
    //get all ManageVehicle
    public ArrayList<ManageVehicle> getAllManageVehicle() {
        ArrayList<ManageVehicle> manageVehicleList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM manage_vehicle";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                user_id = rs.getInt("user_id");
                name = rs.getString("name");
                vehicle_id = rs.getInt("vehicle_id");
                date = rs.getString("date");
                plate = rs.getString("plate");
                engine_no = rs.getString("engine_no");
                chassis_no = rs.getString("chassis_no");
                ManageVehicle manageVehicle = new ManageVehicle(id, user_id, name, vehicle_id, date, plate, engine_no, chassis_no);
                manageVehicleList.add(manageVehicle);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return manageVehicleList;
    }
    //get ManageVehicle by id
    public ManageVehicle getManageVehicleById(int id) {
        ManageVehicle manageVehicle = new ManageVehicle();
        try {
            String sql = "SELECT * FROM manage_vehicle WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                user_id = rs.getInt("user_id");
                name = rs.getString("name");
                vehicle_id = rs.getInt("vehicle_id");
                date = rs.getString("date");
                plate = rs.getString("plate");
                engine_no = rs.getString("engine_no");
                chassis_no = rs.getString("chassis_no");
                manageVehicle = new ManageVehicle(id, user_id, name, vehicle_id, date, plate, engine_no, chassis_no);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return manageVehicle;
    }
    //search ManageVehicle by all field input string search
    public ArrayList<ManageVehicle> searchManageVehicle(String search) {
        ArrayList<ManageVehicle> manageVehicleList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM manage_vehicle WHERE id LIKE ? OR user_id LIKE ? OR name LIKE ? OR vehicle_id LIKE ? OR date LIKE ? OR plate LIKE ? OR engine_no LIKE ? OR chassis_no LIKE ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + search + "%");
            pst.setString(2, "%" + search + "%");
            pst.setString(3, "%" + search + "%");
            pst.setString(4, "%" + search + "%");
            pst.setString(5, "%" + search + "%");
            pst.setString(6, "%" + search + "%");
            pst.setString(7, "%" + search + "%");
            pst.setString(8, "%" + search + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                user_id = rs.getInt("user_id");
                name = rs.getString("name");
                vehicle_id = rs.getInt("vehicle_id");
                date = rs.getString("date");
                plate = rs.getString("plate");
                engine_no = rs.getString("engine_no");
                chassis_no = rs.getString("chassis_no");
                ManageVehicle manageVehicle = new ManageVehicle(id, user_id, name, vehicle_id, date, plate, engine_no, chassis_no);
                manageVehicleList.add(manageVehicle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return manageVehicleList;
    }
    //get ManageVehicle by id input int id


}

