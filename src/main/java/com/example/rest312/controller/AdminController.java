package com.example.rest312.controller;

import com.example.rest312.service.InitServiceImpl;
import com.example.rest312.service.RoleService;
import com.example.rest312.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("")
public class AdminController {

    private final UserService userService;

    private final RoleService roleService;

    private final InitServiceImpl initServiceImpl;

    @Autowired
    public AdminController(UserService userService, RoleService roleService,
                           InitServiceImpl initServiceImpl) {
        this.userService = userService;
        this.roleService = roleService;
        this.initServiceImpl = initServiceImpl;
    }

    @PostConstruct
    public void firstInitialization() {
        initServiceImpl.initServiceImpl();
    }

    @GetMapping("/admin")
    public String admin() {
        return "adminPage";
    }

    @GetMapping(value = "/user")
    public String user() {
        return "userPage";
    }
}