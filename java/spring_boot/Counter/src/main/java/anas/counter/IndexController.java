package anas.counter;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping("/your_server")
    public String index(HttpSession session){
        if (session.getAttribute("counter") == null){
            session.setAttribute("counter",1);
        }
        else {
            session.setAttribute("counter", (Integer) session.getAttribute("counter") + 1);
        }
        return "index.jsp";
    }

@GetMapping("/your_server/counter")
public String show_counter(HttpSession session){
    if (session.getAttribute("counter") == null){
        session.setAttribute("counter",0);
    }

    return "show.jsp";

}




}
