package com.bobbbaich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Bohdan Pohotilyi on 06.02.2016.
 */
@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(value = {"/home", "/"},method = RequestMethod.GET)
    public String home(ModelMap model){
        return "main";
    }
}
