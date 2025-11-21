package com.anas.bookclub.repositories;

import com.anas.bookclub.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByEmail(String email);
    Boolean findAllByUserName(String userName);


}

