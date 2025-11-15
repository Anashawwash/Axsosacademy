package com.anas.savetravels.controllers;


import com.anas.savetravels.models.Travels;
import com.anas.savetravels.services.TravelServices;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TravelsController {
    private final TravelServices travelservices;


    public TravelsController(TravelServices travelservices){
        this.travelservices = travelservices;
    }


    @GetMapping("/")
    public String Landing(@ModelAttribute("travel")Travels travels, Model model){
        model.addAttribute("Travels",travelservices.getAllTravels());
        return "landing.jsp";

    }


    @PostMapping("/create")
    public String CreateTravel(@Valid @ModelAttribute("travel") Travels travels, BindingResult result,Model model){
        model.addAttribute("Travels",travelservices.getAllTravels());
        if(result.hasErrors()){
            return "landing.jsp";
        }
        else{
            travelservices.CreateTravel(travels);
            return "redirect:/";
        }
    }



    @GetMapping("/edit/{id}")
    public String editTravel(@ModelAttribute("travel") Travels travels,@PathVariable("id") Long id,Model model){
        System.out.println("hello i am here bbbandkjaskasjhdkasjdjkahsdkajda");
        model.addAttribute("travel",travelservices.findTravel(id));
        return "edit.jsp";
    }


    @PostMapping("/edit/{id}")
    public String editTravelTwo(@PathVariable("id") Long id,@Valid @ModelAttribute("travel") Travels travels ,BindingResult result){
        if(result.hasErrors()){
            return "edit.jsp";
        }
        else{
            travels.setId(id);
            travelservices.CreateTravel(travels);
            return "redirect:/";
        }
    }


    @GetMapping("/delete/{id}")
    public String deleteTravel(@PathVariable("id") Long id){
        travelservices.deleteTravel(id);
        return "redirect:/";
    }


    @GetMapping("/show/{id}")
    public String showTravel(@PathVariable("id") Long id ,Model model){
        model.addAttribute("travel",travelservices.findTravel(id));
        return "show.jsp";
    }
}
