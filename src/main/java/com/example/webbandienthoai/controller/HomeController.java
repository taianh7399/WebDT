package com.example.webbandienthoai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping
public class HomeController {
    @GetMapping(value = {"/","/index"})
    public String index(Model model, @RequestParam(defaultValue ="")String  name){
        model.addAttribute("name",name);
        return "user/index";
    }
    @GetMapping("/login")
    public String login(){
        return "admin/login";
    }
}
