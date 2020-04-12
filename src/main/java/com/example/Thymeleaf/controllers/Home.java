package com.example.Thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {
     List<String> save = new ArrayList<>();

    @RequestMapping("/index")
    public String fever(){
        return "index";
    }

    @GetMapping("contact")
    public String index(){
        return "index";
    }

    @PostMapping("contact")
    public String contact(@RequestParam(name = "name") String input){
        save.add(input);
        return "redirect:/contact-list";
    }

    @GetMapping("contact-list")
    public String contactList(Model model){
        model.addAttribute("strings", save);
        return "contact";
    }
}
