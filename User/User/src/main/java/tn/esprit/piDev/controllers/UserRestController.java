package tn.esprit.piDev.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;
import tn.esprit.piDev.entities.User;
import tn.esprit.piDev.services.IUserService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/**")
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    IUserService userService ;


    @GetMapping("/retrieve-all-users")
    public List<User> getUsers() {
        List<User> listUsers = userService.retrieveAllUsers() ;
        return listUsers ;
    }

    @GetMapping("/retrieve-user/{idUser}")
    public User retrieveUser(@PathVariable("idUser") long idUser) {
        User user=userService.retrieveUser(idUser) ;
        return user ;
    }

    @PostMapping("/add-user")
    public User addUser(@RequestBody User u) {
        LocalDate currentDate = LocalDate.now();
        u.setInscriptionDate(currentDate);
        User user=userService.addUser(u) ;
        return user ;
    }

    @DeleteMapping("/remove-user/{idUser}")
    public void removeUser(@PathVariable("idUser") long idUSer) {
        userService.removeUser(idUSer);
    }

    @PutMapping("/modify-user")
    public User modifyUser(@RequestBody User u) {
        LocalDate currentDate = LocalDate.now();
        u.setInscriptionDate(currentDate);
        User user=userService.modifyUser(u) ;
        return user ;
    }
}
