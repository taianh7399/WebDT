package com.example.webbandienthoai.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/cms-user-listProduct")
public class ShopController {
    @GetMapping()
    public String shop(){
        return "user/shop";
    }
}
