package anas.hello_human;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @RequestMapping("/")
    public String Hello(@RequestParam(value = "name",required = false) String name,
                        @RequestParam(value = "last" , required = false) String last){
        if (name == null || last == null) {
            return "Hello Human!";
        }
        else{
            return "Hello " + name + " " + last +" !";
        }
    }
//
//    @GetMapping("/")
//    public String looping(@RequestParam(value = "name" ,required = false)String name,@RequestParam(value = "times",required = false)String times){
//        if (name == null || times == null) {
//            return "Hello Human!";
//        }
//        else{
//            int x = 0;
//            int time = Integer.parseInt(times);
//            while( x < time ){
//                String all
//            }
//        }
//    }

}
