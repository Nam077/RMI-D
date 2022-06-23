package Interfaces;

import Models.Message;
import Models.User;

import java.rmi.Remote;
import java.util.ArrayList;

public interface UserInterface extends Remote {
    public User getUserById(int id) throws Exception;
    public User getUser(User user) throws Exception;
    public ArrayList<User> getAllUser() throws Exception;
    public Message insertUser(User user) throws Exception;
    public Message updateUser(User user) throws Exception;
    public Message deleteUser(User user) throws Exception;
    public ArrayList<User> SearchUser(String search) throws Exception;
    public User checkLogin(User user) throws Exception;
}
