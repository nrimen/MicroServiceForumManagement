package tn.esprit.piDev.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.piDev.entities.Stand;
import tn.esprit.piDev.repositories.StandRepository;

import java.util.List;

@Slf4j
@Service
public class StandService implements IStandService{

    @Autowired
    private StandRepository repo;
    @Override
    public List<Stand> findAllStand() {
        return repo.findAll()  ;
    }

    @Override
    public void deleteStand(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Stand UpdateStand(Stand stand) {
        repo.save(stand);
        return stand;
    }

    @Override
    public Stand findById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Stand AddStand(Stand stand) {
        repo.save(stand);
        return stand;
    }
}
