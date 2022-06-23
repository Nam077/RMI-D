package Models;

import java.io.Serializable;

public class ManageVehicle implements Serializable {
    int id;
    int user_id;
    String name;
    int vehicle_id;
    String date;
    String plate;
    String engine_no;
    String chassis_no;

    public ManageVehicle(int id, int user_id, String name, int vehicle_id, String date, String plate, String engine_no, String chassis_no) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.vehicle_id = vehicle_id;
        this.date = date;
        this.plate = plate;
        this.engine_no = engine_no;
        this.chassis_no = chassis_no;
    }
    public ManageVehicle() {
        super();
    }

    @Override
    public String toString() {
        return "ManageVehicle{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", name='" + name + '\'' +
                ", vehicle_id=" + vehicle_id +
                ", date='" + date + '\'' +
                ", plate='" + plate + '\'' +
                ", engine_no='" + engine_no + '\'' +
                ", chassis_no='" + chassis_no + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getEngine_no() {
        return engine_no;
    }

    public void setEngine_no(String engine_no) {
        this.engine_no = engine_no;
    }

    public String getChassis_no() {
        return chassis_no;
    }

    public void setChassis_no(String chassis_no) {
        this.chassis_no = chassis_no;
    }
}
