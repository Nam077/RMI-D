package Services;

import Models.Message;
import Models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserService {
    public ConnectDB connectDB = new ConnectDB();
    public Connection conn = connectDB.getConnection();

    public Message insertUser(User user) {
        Message message = new Message();
        if(checkEmail(user.getEmail())) {
            message.setMessage("Email đã tồn tại!");
            message.setCheck(false);
            return message;
        }
        else {
            try {
                String password = user.getPassword();
                SecurityRSA securityRSA = new SecurityRSA();
                String passwordEncrypt = securityRSA.encrypt(password);
                String sql = "INSERT INTO user(`name`, `email`, `password`, `address`, `phone`, `date`, `code`, `role`) VALUES(?,?,?,?,?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, user.getName());
                pst.setString(2, user.getEmail());
                pst.setString(3, passwordEncrypt);
                pst.setString(4, user.getAddress());
                pst.setString(5, user.getPhone());
                pst.setString(6, user.getDate());
                pst.setString(7, user.getCode());
                pst.setString(8, user.getRole());
                pst.executeUpdate();
                message.setCheck(true);
                message.setMessage("Tài khoản được tạo thành công!");
                return message;
            } catch (Exception e) {
                e.printStackTrace();
                message.setCheck(false);
                message.setMessage("Có lỗi xảy ra");
            }

        }
        return message;
    }

    //update user to database and return true if success else return false
    public Message updateUser(User user) {
    	User userCheck = getUserById(user.getId());
    	
        if(checkEmail(user.getEmail()) && !userCheck.getEmail().equals(user.getEmail())) {
            Message message = new Message();
            message.setCheck(false);
            message.setMessage("Email đã tồn tại!");
            return message;
        }
        Message message = new Message();
        try {
            String password = user.getPassword();
            SecurityRSA securityRSA = new SecurityRSA();
            password = securityRSA.encrypt(password);
            String sql = "UPDATE user SET `name`=?, `email`=?, `password`=?, `address`=?, `phone`=?, `date`=?, `code`=?, `role`=? WHERE `id`=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user.getName());
            pst.setString(2, user.getEmail());
            pst.setString(3, password);
            pst.setString(4, user.getAddress());
            pst.setString(5, user.getPhone());
            pst.setString(6, user.getDate());
            pst.setString(7, user.getCode());
            pst.setString(8, user.getRole());
            pst.setInt(9, user.getId());
            pst.executeUpdate();
            message.setCheck(true);
            message.setMessage("Tải khoản được cập nhật thành công!");
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            message.setCheck(false);
            message.setMessage("Có lỗi xảy ra!");
            return message;
        }
    }
    //check Account email exist in database
    public boolean checkEmail(String email) {
        try {
            String sql = "SELECT * FROM user WHERE email = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    ///delete user from database input object User and return true if success else return false
    public Message deleteUser(User user) {
        Message message = new Message();
        //check in manage_vehicle table if user has vehicle
        try {
            String sql = "SELECT * FROM manage_vehicle WHERE user_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, user.getId());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                message.setCheck(false);
                message.setMessage("Tải khoản không thể xoá vì tài khoản đã đăng ký xe!");
                return message;
            } else {
                sql = "DELETE FROM user WHERE id = ?";
                pst = conn.prepareStatement(sql);
                pst.setInt(1, user.getId());
                pst.executeUpdate();
                message.setCheck(true);
                message.setMessage("Tải khoản đã được xoá thành công!");
                return message;
            }
        } catch (Exception e) {
            e.printStackTrace();
            message.setCheck(false);
            message.setMessage("Có lỗi xảy ra!");
            return message;
        }

    }

    ///kiểu muốn làm theo hướng đối tượng ấy cho nó chuẩn luôn chứ truyền vớ vẩn vào ko thích hahah
    ///checkLogin start check email after check password
    public User checkLogin(User user) {
        //check email exist
        try {
            String sql = "SELECT * FROM user WHERE `email`=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user.getEmail());
            ResultSet rs = pst.executeQuery();
           
            if (rs.next()) {
                //check password
                String password = rs.getString("password");
                SecurityRSA securityRSA = new SecurityRSA();
                password = securityRSA.decrypt(password);
                if (password.equals(user.getPassword())) {
                    //get user
                    User user1 = new User();
                    user1.setId(rs.getInt("id"));
                    user1.setName(rs.getString("name"));
                    user1.setEmail(rs.getString("email"));
                    user1.setPassword(rs.getString("password"));
                    user1.setAddress(rs.getString("address"));
                    user1.setPhone(rs.getString("phone"));
                    user1.setDate(rs.getString("date"));
                    user1.setCode(rs.getString("code"));
                    user1.setRole(rs.getString("role"));
                    return user1;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    //get ArrayList<User> from database and return ArrayList<User>
    ///hiểu cái này ko?
    //// ý là nó sẽ lấy ra tất cả các user trong database
    ///xong nó truyền tất cả vào ArrayList<User>
    public ArrayList<User> getAllUser() {
        ArrayList<User> list = new ArrayList<User>();
        try {
            String sql = "SELECT * FROM user";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ///phần này nó sẽ tạo ra 1 đối tượng User mới
                User user = new User();
                //set du lieu cho user
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                String password = SecurityRSA.decrypt(rs.getString("password"));
                user.setPassword(password);
                user.setAddress(rs.getString("address"));
                user.setPhone(rs.getString("phone"));
                user.setDate(rs.getString("date"));
                user.setCode(rs.getString("code"));
                user.setRole(rs.getString("role"));
                ///phần này nó sẽ thêm vào ArrayList<User>
                list.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        ///phần này nó sẽ trả về ArrayList<User>
        return list;
        ///hiểu chưa
    }

    ///get user from database input Object user by id and return User
    public User getUserById(User user) {
        try {
            String sql = "SELECT * FROM user WHERE `id`=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, user.getId());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setAddress(rs.getString("address"));
                user.setPhone(rs.getString("phone"));
                user.setDate(rs.getString("date"));
                user.setCode(rs.getString("code"));
                user.setRole(rs.getString("role"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    //getUser where Id
    public User getUserById(int id) {
        try {
            String sql = "SELECT * FROM user WHERE `id`=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setAddress(rs.getString("address"));
                user.setPhone(rs.getString("phone"));
                user.setDate(rs.getString("date"));
                user.setCode(rs.getString("code"));
                user.setRole(rs.getString("role"));
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //Search all row in database
    public ArrayList<User> Search(String search) {
        ArrayList<User> list = new ArrayList<User>();
        try {
            String sql = "SELECT * FROM user WHERE `name` LIKE '%" + search + "%' OR `email` LIKE '%" + search + "%' OR `address` LIKE '%" + search + "%' OR `phone` LIKE '%" + search + "%' OR `date` LIKE '%" + search + "%' OR `code` LIKE '%" + search + "%' OR `role` LIKE '%" + search + "%'OR `id` LIKE '%" + search + "%'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                String password = SecurityRSA.decrypt(rs.getString("password"));
                user.setPassword(password);
                user.setAddress(rs.getString("address"));
                user.setPhone(rs.getString("phone"));
                user.setDate(rs.getString("date"));
                user.setCode(rs.getString("code"));
                user.setRole(rs.getString("role"));
                list.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


}
