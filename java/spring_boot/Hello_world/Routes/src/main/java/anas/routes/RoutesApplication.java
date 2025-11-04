package anas.routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 1. Annotation

@SpringBootApplication
@RestController
public class RoutesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoutesApplication.class, args);
    }


    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}
