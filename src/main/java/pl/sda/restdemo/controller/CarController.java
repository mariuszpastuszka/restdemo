package pl.sda.restdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html")
public class CarController {

    @GetMapping("/moje-auta")
    public String myCars() {
        return "my-cars";
    }
}
