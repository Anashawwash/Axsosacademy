package com.anas.demojavastack.Repositories;


import com.anas.demojavastack.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findByEmail(String email);



}
