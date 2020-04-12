package com.example.Thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Fever {
int saveTemp;


    @RequestMapping("/fever")
    public String fever(){
        return "fever";
    }


    @PostMapping("fever")
    public String getTempAndCheckResult(@RequestParam(name = "temperature") Integer input, Model model){
        saveTemp = input;
        model.addAttribute("temp", saveTemp);
        if (saveTemp > 37){
            return "gotFever";
        } else if (saveTemp < 37){
            return "notFever";
        } else{
            return "normal";
        }
    }

}




