package Interfaces;

import Models.ManageVehicle;
import Models.Message;
import Models.Vehicle;

import java.rmi.Remote;
import java.util.ArrayList;

public interface ManageVehicleInterface extends Remote {
    public ArrayList<ManageVehicle> getAllManageVehicle() throws Exception;
    public ManageVehicle getManageVehicle(ManageVehicle manageVehicle) throws Exception;
    public Message insertManageVehicle(ManageVehicle manageVehicle) throws Exception;
    public Message updateManageVehicle(ManageVehicle manageVehicle) throws Exception;
    public Message deleteManageVehicle(ManageVehicle manageVehicle) throws Exception;
    public ArrayList<ManageVehicle> searchManageVehicle(String search) throws Exception;

    public  ManageVehicle getManageVehicleById(int id) throws Exception;

}
