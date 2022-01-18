package com.example.webbandienthoai.controller.api;

import com.example.webbandienthoai.model.request.UserRequest;
import com.example.webbandienthoai.model.respone.UserRespone;
import com.example.webbandienthoai.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cms-user-infomation")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping
    public ResponseEntity<List<UserRespone>> getList(){
        return ResponseEntity.ok(iUserService.getList());
    }

    @PostMapping
    public ResponseEntity<UserRespone> insert(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok(iUserService.insert(userRequest));
    }

}
