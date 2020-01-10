package com.example.controller;

import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody User user){
      System.out.println("用户名:"+user.getUsername()+"密码:"+user.getPassword());
        return "ok-instanceServe01r-8080";
    }
}
