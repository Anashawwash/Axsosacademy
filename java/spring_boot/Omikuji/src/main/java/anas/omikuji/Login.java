package anas.omikuji;


import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {

    @GetMapping("/")
    public String logIn(){
        return "login.jsp";
    }

    @PostMapping("/s")
    public String show(@RequestParam(value ="number") String number,
                       @RequestParam(value ="city")String city,
                       @RequestParam(value = "person")String person,
                       @RequestParam(value = "hobby") String hobby,
                       @RequestParam(value = "thing") String thing,
                       @RequestParam(value = "nice")String nice,
                       HttpSession Session){
        Session.setAttribute("number",number);
        Session.setAttribute("city",city);
        Session.setAttribute("person",person);
        Session.setAttribute("hobby",hobby);
        Session.setAttribute("thing",thing);
        Session.setAttribute("nice",nice);


        return "redirect:/show";
    }

    @GetMapping("/show")
    public String showOne(){
        return "show.jsp";
    }
}
