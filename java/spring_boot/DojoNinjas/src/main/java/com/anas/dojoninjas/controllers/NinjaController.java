package com.anas.dojoninjas.controllers;


import com.anas.dojoninjas.models.Ninja;
import com.anas.dojoninjas.services.DojoServices;
import com.anas.dojoninjas.services.NinjaServices;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NinjaController {
    private final DojoServices dojoservices;
    private final NinjaServices ninjaservices;

    public NinjaController(DojoServices dojoservices , NinjaServices ninjaservices){
        this.dojoservices = dojoservices;
        this.ninjaservices = ninjaservices;
    }


    @GetMapping("/ninja")
    public String landNinja(@ModelAttribute("ninja") Ninja ninja, Model model){
        model.addAttribute("Dojos",dojoservices.findAllDojos());
        return "ninjaForm.jsp";
    }

    @PostMapping("/create/ninja")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result){
        if(result.hasErrors()){
            return "ninjaForm.jsp";
        }
        else{
            ninjaservices.createNinja(ninja);
            return  "redirect:/showall";
        }
    }


    @GetMapping("/showall")
    public String showAll(Model model){
        model.addAttribute("ninjas",ninjaservices.getAllNinjas());


        return "showAll.jsp";




    }
}
