package com.anas.burgertrackerone.repositories;


import com.anas.burgertrackerone.models.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgerRepository extends CrudRepository<Burger,Long>{

}
