package Implements;

import Interfaces.VehicleInterface;
import Models.Message;
import Models.Vehicle;
import Services.VehicleService;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class VehicleImplement extends UnicastRemoteObject implements VehicleInterface {
    public VehicleService vehicleService = new VehicleService();

    public VehicleImplement() throws Exception {
        super();
    }


    @Override
    public Vehicle getVehicleById(int id) throws Exception {
        return vehicleService.getVehicleById(id);
    }

    @Override
    public ArrayList<Vehicle> getAllVehicle() throws Exception {
        return vehicleService.getAllVehicle();
    }

    @Override
    public Vehicle getVehicle(Vehicle vehicle) throws Exception {
        return null;
    }

    @Override
    public Message insertVehicle(Vehicle vehicle) throws Exception {
        return vehicleService.insertVehicle(vehicle);
    }

    @Override
    public Message updateVehicle(Vehicle vehicle) throws Exception {
        return vehicleService.updateVehicle(vehicle);
    }

    @Override
    public Message deleteVehicle(Vehicle vehicle) throws Exception {
        return vehicleService.deleteVehicle(vehicle);
    }

    @Override
    public ArrayList<Vehicle> searchVehicle(String search) throws Exception {
        return vehicleService.searchVehicle(search);
    }
}
