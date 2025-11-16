package com.anas.testpro.services;


import com.anas.testpro.models.Person;
import com.anas.testpro.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServices {

    @Autowired
    PersonRepository personRepo;


    public void CreatePerson(Person person){
        personRepo.save(person);
    }

    public Person getPerson(Long id) {
        Optional<Person> optional = personRepo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;

    }

}
