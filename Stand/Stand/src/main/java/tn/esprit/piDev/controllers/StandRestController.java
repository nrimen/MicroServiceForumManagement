package tn.esprit.piDev.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.piDev.entities.Stand;
import tn.esprit.piDev.repositories.StandRepository;
import tn.esprit.piDev.services.IStandService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/stand")
public class StandRestController {
    @Autowired
    IStandService standService;

    @GetMapping("/retrieve-all-stands")
    public List<Stand> getStands() {
        List<Stand> listStands = standService.findAllStand();
        return listStands;
    }

    @GetMapping("/retrieve-stand/{stand-id}")
    public Stand retrieveStand(@PathVariable("stand-id") Long chId) {
        Stand stand = standService.findById(chId);
        return stand;}

    @PostMapping("/add-stand")
    public Stand addStand(@RequestBody Stand s) {
        Stand stand = standService.AddStand(s);
        return stand;
    }

    @DeleteMapping("/remove-stand/{stand-id}")
    public void removeStand(@PathVariable("stand-id") Long chId) {
        standService.deleteStand(chId);
    }

    @PutMapping("/modify-stand")
    public Stand modifyStand(@RequestBody Stand s) {
        Stand stand = standService.UpdateStand(s);
        return stand;
    }
}
