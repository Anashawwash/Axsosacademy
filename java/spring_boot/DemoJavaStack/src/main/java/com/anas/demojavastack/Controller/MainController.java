package com.anas.demojavastack.Controller;


import com.anas.demojavastack.Models.LoginUser;
import com.anas.demojavastack.Models.User;
import com.anas.demojavastack.Services.UserServices;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    private UserServices userServ;


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
                return "Landing.jsp";
            }
            else{
                session.setAttribute("User",user);
                return "redirect:/home";
            }
        }
    }


    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser,BindingResult x , @ModelAttribute("newUser") User user, HttpSession session ){
        if (x.hasErrors()) {
            return "Landing.jsp";
        } else {
            User newuser = userServ.LoginVal(x,loginUser);
            if(newuser == null){
                return "Landing.jsp";
            }
            else{
                session.setAttribute("User",newuser);
                return "redirect:/home";
            }
        }
    }

    @GetMapping("/logout")
    public String Logout(HttpSession session){
        session.removeAttribute("User");
        return "redirect:/";
    }
    @RequestMapping(value = "/**")
    public String redirectToHome(HttpSession session) {
        User user = (User) session.getAttribute("User");
        if (user == null){
            return "redirect:/";
        }
        return "redirect:/home";
    }



}
