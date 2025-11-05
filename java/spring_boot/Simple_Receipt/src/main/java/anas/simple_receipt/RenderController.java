package anas.simple_receipt;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
public class RenderController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("Name", "Grace Hopper");
        model.addAttribute("ItemName", "Cooper wire");
        model.addAttribute("ItemPrice", "$5.25");
        model.addAttribute("description", "Metal strips, also an illustration of nanoseconds");
        model.addAttribute("Vendor","Littel Things corner Store");
        return "index.jsp";
    }


}
