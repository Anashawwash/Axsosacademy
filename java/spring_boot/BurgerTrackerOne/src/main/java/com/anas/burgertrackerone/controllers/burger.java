package com.anas.burgertrackerone.controllers;


import com.anas.burgertrackerone.models.Burger;
import com.anas.burgertrackerone.services.BurgerService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class burger {
    private final BurgerService burgerservice;


    public burger(BurgerService burgerservice){
        this.burgerservice = burgerservice;
    }


   @GetMapping("/")
   public String landingPage(@ModelAttribute("burger") Burger burger,Model model){
        model.addAttribute("burgers",burgerservice.getAllBurgers());
       return "landing.jsp";
   }



   @PostMapping("/create")
    public String createBurger(@Valid @ModelAttribute("burger") Burger burger , BindingResult result,Model model){
       model.addAttribute("burgers",burgerservice.getAllBurgers());
       if(result.hasErrors()){
           return "landing.jsp";
       }
       else{
           burgerservice.createBurger(burger);
           return "redirect:/";
       }

   }



   @GetMapping("/edit/{id}")
    public String editBurger(@ModelAttribute("burger")Burger burger,@PathVariable("id")Long id,Model model){
        model.addAttribute("burger",burgerservice.getBurger(id));
        return "edit.jsp";
   }

    @PostMapping("/edit/{id}")
    public String editBurgerTwo(@Valid @ModelAttribute("burger") Burger burger ,BindingResult result){
        if(result.hasErrors()){
            return "edit.jsp";
        }
        else{
            burgerservice.editBurger(burger);
            return "redirect:/";
        }
    }


}
