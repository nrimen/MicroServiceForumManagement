package tn.esprit.piDev.services;

import tn.esprit.piDev.entities.User;

import java.util.List;

public interface IUserService {
    public List<User> retrieveAllUsers() ;
    public User retrieveUser(long idUser) ;
    public User addUser(User user) ;
    public void removeUser(long idUser) ;
    public User modifyUser(User user) ;
}
