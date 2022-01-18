package com.example.webbandienthoai.controller.api;

import com.example.webbandienthoai.model.entity.UserEntity;
import com.example.webbandienthoai.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/cms-information")
public class informationController {

@Autowired
    UserRepository userRepository;


    @GetMapping("/getUser")
    public List<UserEntity>  getUserEntityByNAme(@RequestParam Integer id) {
        List<UserEntity> users = userRepository.getUserEntityById( id);
        if(users != null){
            return users ;
    }
        else {
            return null;
        }

}
}
