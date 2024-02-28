package tn.esprit.piDev.services;

import tn.esprit.piDev.entities.Stand;

import java.util.List;

public interface IStandService {
    public List<Stand> findAllStand();
    public void deleteStand(Long id);
    public Stand UpdateStand(Stand stand);
    public Stand findById (Long id);
    public Stand AddStand (Stand stand);

}
