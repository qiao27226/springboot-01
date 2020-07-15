package com.qf.controller;

import com.qf.pojo.SysUser;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("getAll")
    public List<SysUser> getAll(){
        return userService.getAll();
    }
    @RequestMapping("tiaozhaun")
    public String tiaozhaun(){
        return "pagehome/index.html";
    }
}
