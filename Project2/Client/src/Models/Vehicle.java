package Models;

import java.io.Serializable;

public class Vehicle implements Serializable {
    int id;
    String name;
    String color;
    String type;
    String date;
    String seat_capacity;
    String capacity;
    String brand;
    public Vehicle() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Vehicle(int id, String name, String color, String type, String date, String seat_capacity, String capacity,
                   String brand) {
        super();
        this.id = id;
        this.name = name;
        this.color = color;
        this.type = type;
        this.date = date;
        this.seat_capacity = seat_capacity;
        this.capacity = capacity;
        this.brand = brand;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getSeat_capacity() {
        return seat_capacity;
    }
    public void setSeat_capacity(String seat_capacity) {
        this.seat_capacity = seat_capacity;
    }
    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

}
