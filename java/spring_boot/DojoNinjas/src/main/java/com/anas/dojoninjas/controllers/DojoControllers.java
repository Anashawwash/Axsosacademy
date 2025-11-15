package com.anas.dojoninjas.controllers;


import com.anas.dojoninjas.models.Dojo;
import com.anas.dojoninjas.services.DojoServices;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DojoControllers {
    private final DojoServices dojoservices;


    public DojoControllers(DojoServices dojoservices){
        this.dojoservices = dojoservices;
    }



    @GetMapping("/")
    public String landing(@ModelAttribute("dojo")Dojo dojo){
        return "landing.jsp";
    }

    @PostMapping("/create/dojo")
    public  String dojocreate(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result){
        if (result.hasErrors()){
            return "landing.jsp";
        }
        else{
            dojoservices.create(dojo);
            return "redirect:/";
        }




    }
}
