package Models;

import java.io.Serializable;

public class User implements Serializable {
    int id;
    String name;
    String email;
    String password;
    String address;
    String phone;
    String date;
    String code;
    String role;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(int id, String name, String email, String password, String address, String phone, String date,
                String code, String role) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.date = date;
        this.code = code;
        this.role = role;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", address="
                + address + ", phone=" + phone + ", date=" + date + ", code=" + code + ", role=" + role + "]";
    }
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Nguyen Van A");
        user.setEmail("aksdbk");
        user.setPassword("123");
        user.setAddress("HN");
        user.setPhone("123");
        user.setDate("12/12/12");
        user.setCode("123");
        System.out.println(user);
    }

}