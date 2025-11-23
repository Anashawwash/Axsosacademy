package com.anas.demojavastack.Services;


import com.anas.demojavastack.Models.LoginUser;
import com.anas.demojavastack.Models.User;
import com.anas.demojavastack.Repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;


@Service
public class UserServices {

    @Autowired
    private UserRepository userRepo;


    public void saveUser(User user){
        userRepo.save(user);
    }



    public User NewUserVal(BindingResult result, User user){
        if (userRepo.findByEmail(user.getEmail()) != null){
            result.rejectValue("email","Error","this email is already taken");
            return null;
        }
        if(!user.getPassword().equals(user.getConfirmPas())){
            result.rejectValue("confirmPas","Error","the Password did not match");
            return null;
        }
        try{
            String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
            user.setPassword(hashed);
            userRepo.save(user);
        } catch (DataIntegrityViolationException e) {
            result.rejectValue("firstName","Error","the Email or FirstName it taken");
            result.rejectValue("email","Error","the Email or UserName it taken");
            return null;
        }
        return user;
    }


    public User LoginVal(BindingResult result, LoginUser loginUser){
        User user = userRepo.findByEmail(loginUser.getLoginEmail());
        if (user == null){
            result.rejectValue("loginEmail","Error","this Email is not exist");
            return null;
        }
        else{
            if (!BCrypt.checkpw(loginUser.getConfarm(), user.getPassword())) {
                result.rejectValue("confarm","Error","the Password or Email are invalid ");
                return null;
            }
        }
        return user;
    }

    public User getById(Long id){
        return userRepo.findById(id).get();
    }

}
