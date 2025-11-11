package anas.ninjagoldgame;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.*;

import java.text.SimpleDateFormat;



@Controller
public class MainGame{
    ArrayList<String> myStack = new ArrayList<>();


    @GetMapping("/")
    public String landingPage(HttpSession session){
        if(session.getAttribute("Ninja") == null )
            session.setAttribute("Ninja" , 0);
        return "Landing.jsp";
    }


    @PostMapping("/get-gold")
    public String getGold(HttpSession session, @RequestParam(value = "hidden_input") String hidden){
            Random random = new Random();
        ArrayList<String> TempStack = new ArrayList<>();
        SimpleDateFormat Format = new SimpleDateFormat("MMMM E yyyy h:ma");
            String date = Format.format(new Date());


        if (hidden.equals("farm")){
            int ranInt = random.nextInt(10,20);
            int n = (int) session.getAttribute("Ninja");
            n += ranInt;
            String str = String.valueOf(ranInt);
            myStack.add("you entered a farm and earned "+ str+" gold "+ date);
            session.setAttribute("Ninja",n);
        }
        else if(hidden.equals("cave")){
            int ranInt = random.nextInt(5,10);
            int n = (int) session.getAttribute("Ninja");
            n += ranInt;
            String str = String.valueOf(ranInt);
            myStack.add( "you entered a Cave and earned "+ str+" gold "+ date);
            session.setAttribute("Ninja",n);
        }
        else if (hidden.equals("house")){
            int ranInt = random.nextInt(2,6);
            int n = (int) session.getAttribute("Ninja");
            n += ranInt;
            String str = String.valueOf(ranInt);
            myStack.add( "you entered a House and earned"+ str+" gold "+ date);
            session.setAttribute("Ninja",n);
        }
        else if (hidden.equals("quest")){
            int ranInt = random.nextInt(0,51);
            String str = String.valueOf(ranInt);
            int bool = random.nextInt(0,2);
            int n = (int)session.getAttribute("Ninja");
//            if bool is 1 we will add gold
            if (bool == 1){
                n += ranInt;
                myStack.add("you completed a quest and earned "+ str+" gold "+ date);
            }
//      else we will take gold
            else {
                n -= ranInt;
                myStack.add("you Failed a quest and lost "+ str+" gold "+ date);
            }
            session.setAttribute("Ninja",n);
        }

        TempStack = myStack;
        Collections.reverse(TempStack);
        session.setAttribute("message",TempStack);
        return "redirect:";
    }

    @GetMapping("/get-gold")
    public String handel(){
        return "redirect:";
    }
}
