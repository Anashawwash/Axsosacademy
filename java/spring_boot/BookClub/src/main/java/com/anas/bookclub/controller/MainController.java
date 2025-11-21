package com.anas.bookclub.controller;
import com.anas.bookclub.models.LoginUser;
import com.anas.bookclub.models.User;
import com.anas.bookclub.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private UserService userServ;


    @GetMapping("/")
    public String landing(@ModelAttribute("newUser") User user,
                          @ModelAttribute("loginUser") LoginUser loginUser) {
        return "Landing.jsp";
    }


    @PostMapping("/adduser")
    public String addUser(@ModelAttribute("loginUser") LoginUser loginUser,
                          @Valid @ModelAttribute("newUser") User user, BindingResult result , HttpSession session) {
        if (result.hasErrors()) {
            return "Landing.jsp";
        } else {
            if (userServ.NewUserVal(result,user) != user){
                return "landing.jsp";
            }
            else{
                session.setAttribute("User",user);
                return "redirect:/home";
            }
        }
    }


    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser,BindingResult result,
                        @ModelAttribute("newUser") User user,HttpSession session){
        if (result.hasErrors()) {
            return "landing.jsp";
        } else {
            User newuser = userServ.LoginVal(result,loginUser);
            if(user == null){
                return "landing.jsp";
            }
            else{
                session.setAttribute("User",newuser);
                return "redirect:/home";
            }
        }
    }


    @GetMapping("/home")
    public String homePage(Model model ,HttpSession session){
        model.addAttribute("User",session.getAttribute("User"));
        if (session.getAttribute("User") == null){
            return  "redirect:/";
        }
        return "home.jsp";
    }


}