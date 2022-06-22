package Models;

import Interfaces.ManageVehicleInterface;
import Interfaces.UserInterface;
import Interfaces.VehicleInterface;

import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;

public class Client {
    public UserInterface userInterface;
    public VehicleInterface vehicleInterface;
    ManageVehicleInterface manageVehicleInterface;

    public Client() {
        try {
            // tạo một đối tượng UserInterface từ Server ở port 1099 và tên UserInterface
            userInterface = (UserInterface) LocateRegistry.getRegistry("localhost", 1099).lookup("UserInterface");
            vehicleInterface = (VehicleInterface) LocateRegistry.getRegistry("localhost", 1099).lookup("VehicleInterface");
            manageVehicleInterface = (ManageVehicleInterface) LocateRegistry.getRegistry("localhost", 1099).lookup("ManageVehicleInterface");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<User> getAllUser() throws Exception {
        return userInterface.getAllUser();
    }

    public User getUser(User user) throws Exception {
        return userInterface.getUser(user);
    }

    public Message insertUser(User user) throws Exception {
        return userInterface.insertUser(user);
    }

    public Message updateUser(User user) throws Exception {
        return userInterface.updateUser(user);
    }

    public Message deleteUser(User user) throws Exception {
        return userInterface.deleteUser(user);
    }

    public ArrayList<User> searchUser(String search) throws Exception {
        return userInterface.SearchUser(search);
    }

    public User checkLogin(User user) throws Exception {
        return userInterface.checkLogin(user);
    }

    public User getUserById(int id) throws Exception {
        return userInterface.getUserById(id);
    }

    public ArrayList<Vehicle> getAllVehicle() throws Exception {
        return vehicleInterface.getAllVehicle();
    }

    public Vehicle getVehicle(Vehicle vehicle) throws Exception {
        return vehicleInterface.getVehicle(vehicle);
    }

    public Message insertVehicle(Vehicle vehicle) throws Exception {
        return vehicleInterface.insertVehicle(vehicle);
    }

    public Message updateVehicle(Vehicle vehicle) throws Exception {
        return vehicleInterface.updateVehicle(vehicle);
    }

    public Message deleteVehicle(Vehicle vehicle) throws Exception {
        return vehicleInterface.deleteVehicle(vehicle);
    }

    public Vehicle getVehicleById(int id) throws Exception {
        return vehicleInterface.getVehicleById(id);
    }

    public ArrayList<Vehicle> searchVehicle(String search) throws Exception {
        return vehicleInterface.searchVehicle(search);
    }

    public Message insertManageVehicle(ManageVehicle manageVehicle) throws Exception {
        return manageVehicleInterface.insertManageVehicle(manageVehicle);
    }
    public ArrayList<ManageVehicle> getAllManageVehicle() throws Exception {
        return manageVehicleInterface.getAllManageVehicle();
    }
    public ManageVehicle getManageVehicle(ManageVehicle manageVehicle) throws Exception {
        return manageVehicleInterface.getManageVehicle(manageVehicle);
    }
    public Message updateManageVehicle(ManageVehicle manageVehicle) throws Exception {
        return manageVehicleInterface.updateManageVehicle(manageVehicle);
    }
    public Message deleteManageVehicle(ManageVehicle manageVehicle) throws Exception {
        return manageVehicleInterface.deleteManageVehicle(manageVehicle);
    }
    public ArrayList<ManageVehicle> searchManageVehicle(String search) throws Exception {
        return manageVehicleInterface.searchManageVehicle(search);
    }
    public ManageVehicle getManageVehicleById(int id) throws Exception {
        return manageVehicleInterface.getManageVehicleById(id);
    }

}
