package Interfaces;

import Models.Message;
import Models.Vehicle;

import java.rmi.Remote;
import java.util.ArrayList;

public interface VehicleInterface extends Remote {
    public Vehicle getVehicleById(int id) throws Exception;
    public ArrayList<Vehicle> getAllVehicle() throws Exception;
    public Vehicle getVehicle(Vehicle vehicle) throws Exception;
    public Message insertVehicle(Vehicle vehicle) throws Exception;
    public Message updateVehicle(Vehicle vehicle) throws Exception;
    public Message deleteVehicle(Vehicle vehicle) throws Exception;
    public ArrayList<Vehicle> searchVehicle(String search) throws Exception;

}
