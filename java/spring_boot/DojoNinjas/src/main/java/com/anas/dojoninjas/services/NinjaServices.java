package com.anas.dojoninjas.services;


import com.anas.dojoninjas.models.Ninja;
import com.anas.dojoninjas.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

@Service
public class NinjaServices {
    private final NinjaRepository ninjarepository;


    public NinjaServices(NinjaRepository ninjarepository){
        this.ninjarepository = ninjarepository;
    }


    public void createNinja(Ninja ninja){
        ninjarepository.save(ninja);
    }

    public Iterable<Ninja> getAllNinjas(){
        return ninjarepository.findAll();
    }
}
