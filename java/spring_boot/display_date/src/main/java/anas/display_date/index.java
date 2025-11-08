package anas.display_date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class index {

    @GetMapping("/")
    public String index() {
        return "index.jsp";
    }

    @GetMapping("/time")
    public String time(Model model) {
        SimpleDateFormat Format = new SimpleDateFormat("hh:mm a");
        String date = Format.format(new Date());
        model.addAttribute("date", date);
        return "Time.jsp";
    }

    @GetMapping("/date")
    public String date(Model model) {
        SimpleDateFormat Format = new SimpleDateFormat("E , MMM MM , yyyy");
        String date = Format.format(new Date());
        model.addAttribute("date", date);
        return "date.jsp";
    }
}
