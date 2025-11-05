package anas.pathvariables;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @RequestMapping("/Daikichi/travel/{land}")
    public String travel(@PathVariable("land") String land) {
        return "Congratulations! you will soon travel to " + land;
    }

    @GetMapping("/Daikichi/today")
    public String today() {
        return "'Today you will find luck in all your endeavors!'";
    }

    @GetMapping("/Daikichi/Tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

    @GetMapping("/Daikichi/lotto/{number}")
    public String lotto(@PathVariable("number") String number) {
        int num = Integer.parseInt(number);
        if (num % 2 == 0) {
            return "You will take a grand journey in the near future but be wary of tempting offers";
        } else
        {
            return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
        }
    }
}


