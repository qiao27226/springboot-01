package com.qf.controller;

import com.qf.note.CheckToken;
import com.qf.pojo.TbUser;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("api/user/")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("getAll")
    @CheckToken
    public List<TbUser> getAll(){
        return userService.getAll();
    }



}
