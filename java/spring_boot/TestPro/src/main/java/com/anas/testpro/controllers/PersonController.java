package com.anas.testpro.controllers;


import com.anas.testpro.models.Passport;
import com.anas.testpro.models.Person;
import com.anas.testpro.services.PassportService;
import com.anas.testpro.services.PersonServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    @Autowired
    private PersonServices personServ;

    @Autowired
    private PassportService passportServ;

    @GetMapping("/")
    public String Landing(@ModelAttribute("person")Person person, @ModelAttribute("passport")Passport passport){
        return"landing.jsp";
    }




    @PostMapping("/create")
    public String created(@Valid @ModelAttribute("person") Person person, BindingResult result){
        if (result.hasErrors()){
            return "landing.jsp";
        }
        else{
            personServ.CreatePerson(person);
           Long id =  person.getId();
            return "redirect:/show/" +id;
        }
    }


    @GetMapping("/show/{id}")
   public String Passport(@PathVariable("id")Long id , @ModelAttribute("passport") Passport passport, Model model){
        model.addAttribute("person_id",id);
        return "show.jsp";
   }


   @PostMapping("/passport")
    public String Passport(@Valid @ModelAttribute("passport") Passport passport , BindingResult result ){
        if (result.hasErrors()){
            return "show.jsp";
       }
        else{
            passportServ.CreatePassport(passport);
            return "hello.jsp";
        }


   }
}


