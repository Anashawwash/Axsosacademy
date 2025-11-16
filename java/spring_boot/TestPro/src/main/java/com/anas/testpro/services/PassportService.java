package com.anas.testpro.services;


import com.anas.testpro.models.Passport;
import com.anas.testpro.repositories.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassportService {
    @Autowired
    private PassportRepository passportRepo;



    public void CreatePassport(Passport passport){
        passportRepo.save(passport);
    }
}
