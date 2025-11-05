package anas.routes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping("/Daikichi")
    public String index() {
        return "Welcome";
    }

    @GetMapping("/Daikichi/today")
    public String today() {
        return "'Today you will find luck in all your endeavors!'";
    }

    @GetMapping("/Daikichi/Tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}

