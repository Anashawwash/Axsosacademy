package com.anas.savetravels.services;


import com.anas.savetravels.models.Travels;
import com.anas.savetravels.repositories.TravelRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TravelServices {
    private final TravelRepository travelrepository;


    public TravelServices(TravelRepository travelrepository){
        this.travelrepository = travelrepository;
    }


    public void CreateTravel(Travels travels){
        travelrepository.save(travels);
    }

    public Iterable<Travels> getAllTravels(){
        return travelrepository.findAll();
    }


    public Travels findTravel(Long id){
        Optional<Travels> travel =  travelrepository.findById(id);
        if (travel.isPresent()){
            return travel.get();
        }
        else{
            return null;
        }
    }


    public void deleteTravel(Long id){
        travelrepository.delete(findTravel(id));
    }

}
