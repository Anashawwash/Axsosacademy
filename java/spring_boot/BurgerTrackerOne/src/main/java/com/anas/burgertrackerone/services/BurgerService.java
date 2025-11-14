package com.anas.burgertrackerone.services;

import com.anas.burgertrackerone.models.Burger;
import com.anas.burgertrackerone.repositories.BurgerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BurgerService {
    private final BurgerRepository burgerrepository;


    public BurgerService(BurgerRepository burgerrepository){
        this.burgerrepository = burgerrepository;
    }



    public void createBurger(Burger burger){
        burgerrepository.save(burger);
    }


    public Iterable<Burger> getAllBurgers(){
        return burgerrepository.findAll();
    }

    public Burger getBurger(Long id){
        Optional<Burger> burger =  burgerrepository.findById(id);
        if(burger.isPresent()){
            return burger.get();
        }
        else{
            return null;
        }
    }

    public void editBurger(Burger burger){
        burgerrepository.save(burger);
    }


}
