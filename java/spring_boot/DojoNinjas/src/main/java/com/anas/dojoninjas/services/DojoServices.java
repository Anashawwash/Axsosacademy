package com.anas.dojoninjas.services;


import com.anas.dojoninjas.models.Dojo;
import com.anas.dojoninjas.repositories.DojoRepository;
import org.springframework.stereotype.Service;


@Service
public class DojoServices{
    private final DojoRepository dojorepository;


    public DojoServices(DojoRepository dojorepository){
        this.dojorepository = dojorepository;
    }



    public void create(Dojo dojo){
        dojorepository.save(dojo);
    }


    public  Iterable<Dojo> findAllDojos(){
        return dojorepository.findAll();
    }
}
