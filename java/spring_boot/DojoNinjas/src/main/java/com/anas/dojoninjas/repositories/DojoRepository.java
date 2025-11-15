package com.anas.dojoninjas.repositories;

import com.anas.dojoninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DojoRepository extends CrudRepository<Dojo,Long>{


}
