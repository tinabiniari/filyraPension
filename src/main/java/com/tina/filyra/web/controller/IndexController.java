package com.tina.filyra.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String welcome()
    {
        return "index";
    }

    @GetMapping("/page")
    public String getPage() {
        return "page";
    }
}
