package com.devcolibri.secure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/secret")
public class SecretController {

    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model){
        return "secret";
    }

}
