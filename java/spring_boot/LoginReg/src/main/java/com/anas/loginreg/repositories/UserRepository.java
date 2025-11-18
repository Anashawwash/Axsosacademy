package com.anas.loginreg.repositories;

import com.anas.loginreg.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{

    User findByEmail(String email);
    Boolean findAllByUserName(String userName);


}
