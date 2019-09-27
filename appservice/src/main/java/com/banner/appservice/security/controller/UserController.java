package com.banner.appservice.security.controller;

import com.banner.appservice.security.dto.SysUser;
import com.banner.appservice.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("account")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public String userLogin(@RequestBody SysUser user) {
        userService.loadUserByUsername(user.getUsername());

        return "login success";
    }

    @RequestMapping(value = "/register")
    @ResponseBody
    public String userRegiste() {
//        userService.
        return "login success";
    }

}







