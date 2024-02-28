package tn.esprit.piDev.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.piDev.entities.User;
import tn.esprit.piDev.repositories.UserRepository;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository ;
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }

    public User retrieveUser(long idUser) {
        return userRepository.findById(idUser).get() ;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void removeUser(long idUser) {
        userRepository.deleteById(idUser);
    }

    public User modifyUser(User user) {
        return userRepository.save(user);
    }
}
