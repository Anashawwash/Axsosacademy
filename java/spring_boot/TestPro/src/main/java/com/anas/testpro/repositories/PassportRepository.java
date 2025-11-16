package com.anas.testpro.repositories;


import com.anas.testpro.models.Passport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PassportRepository extends CrudRepository<Passport,Long>{
}
