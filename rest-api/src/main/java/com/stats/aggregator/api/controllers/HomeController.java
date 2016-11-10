package com.stats.aggregator.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/help")
    public ModelAndView help() {
        return new ModelAndView("redirect:/swagger-ui.html");

    }
}
