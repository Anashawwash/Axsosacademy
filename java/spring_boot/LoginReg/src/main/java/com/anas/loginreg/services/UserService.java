package com.anas.loginreg.services;


import com.anas.loginreg.models.LoginUser;
import com.anas.loginreg.models.User;
import com.anas.loginreg.repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;


    public void saveUser(User user){
        userRepo.save(user);
    }



    public User NewUserVal(BindingResult result, User user){
        if (userRepo.findByEmail(user.getEmail()) != null){
            result.rejectValue("email","Error","this email is User");
        }
        if(!user.getPassword().equals(user.getConfirmPas())){
          result.rejectValue("confirmPas","Error","the Password did not match");
          return null;
        }

        try{
            userRepo.save(user);
            String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
            user.setPassword(hashed);
        } catch (DataIntegrityViolationException e) {
            result.rejectValue("userName","Error","the Email or UserName it taken");
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
            if (!BCrypt.checkpw(loginUser.getConfirm(), user.getPassword())) {
                result.rejectValue("confirm","Error","the Password or Email are invalid ");
                return null;

            }
        }
        return user;


    }


    public User getById(Long id){
        return userRepo.findById(id).orElse(null);
    }


}
