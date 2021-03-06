package com.nibado.example.springmvctemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RootController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String greeting(Model model) {
        model.addAttribute("name", "World");
        return "index";
    }
}
