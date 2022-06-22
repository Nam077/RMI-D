package Models;

import Implements.ManageVehicleImplement;
import Implements.UserImplement;
import Implements.VehicleImplement;
import Interfaces.ManageVehicleInterface;
import Interfaces.UserInterface;
import Interfaces.VehicleInterface;

import java.rmi.registry.LocateRegistry;

//class Server RMI and registry UserInterface
public class Server {
    public  Server() {
        try {
            //Tạo LocateRegistry để lấy địa chỉ của Registry ở port 1099
            LocateRegistry.createRegistry(1099);
            // tạo một đối tượng UserInterface
            UserInterface userInterface = new UserImplement();
            VehicleInterface vehicleInterface = new VehicleImplement();
            ManageVehicleInterface manageVehicleInterface = new ManageVehicleImplement();

            // Register the server
            LocateRegistry.getRegistry().rebind("UserInterface", userInterface);
            LocateRegistry.getRegistry().rebind("VehicleInterface", vehicleInterface);
            LocateRegistry.getRegistry().rebind("ManageVehicleInterface", manageVehicleInterface);
            System.out.println("Server is running");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}