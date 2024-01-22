package com.example.exercicespringsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controleur {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }
    @GetMapping("/admin")
    public String showAdmin(){
        return "admin";
    }
    @GetMapping("/login")
    public String showLogin(){
        return "login";
    }
    @GetMapping("/tasks/add")
    public String showtasks(){
        return "nouvelleTache";
    }
}
