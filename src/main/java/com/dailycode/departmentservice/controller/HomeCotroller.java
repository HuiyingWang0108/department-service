package com.dailycode.departmentservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCotroller {

    @RequestMapping("/home")
    public String displayHomePage() {
        return "home.html";
    }
}
