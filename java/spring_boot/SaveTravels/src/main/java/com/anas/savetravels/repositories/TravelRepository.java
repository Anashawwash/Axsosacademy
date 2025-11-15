package com.anas.savetravels.repositories;


import com.anas.savetravels.models.Travels;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends CrudRepository<Travels,Long>{

}
