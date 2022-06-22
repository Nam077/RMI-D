package Implements;

import Interfaces.UserInterface;
import Services.UserService;
import Models.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class UserImplement extends UnicastRemoteObject implements UserInterface {
    public UserService userService = new UserService();

    public UserImplement() throws Exception {
        super();
    }

    @Override
    public User getUserById(int id) throws Exception {
        return userService.getUserById(id);
    }

    @Override
    public User getUser(User user) {
        return null;
    }

    @Override
    public ArrayList<User> getAllUser() throws Exception {
        return userService.getAllUser();
    }

    @Override
    public Message insertUser(User user) throws Exception {
        return userService.insertUser(user);
    }

    @Override
    public Message updateUser(User user) throws Exception {
        return userService.updateUser(user);
    }

    @Override
    public Message deleteUser(User user) throws Exception {
        return userService.deleteUser(user);
    }

    @Override
    public ArrayList<User> SearchUser(String search) throws Exception {
        return userService.Search(search);
    }

    @Override
    public User checkLogin(User user) throws Exception {
        return userService.checkLogin(user);
    }
}
