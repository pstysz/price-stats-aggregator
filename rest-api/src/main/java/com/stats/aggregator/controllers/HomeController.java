package com.stats.aggregator.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
@Api(description = "Common actions")
public class HomeController {

    @GetMapping({"help", "", "api-docs"})
    @ApiOperation(value = "Redirects to this page")
    public ModelAndView help() {
        return new ModelAndView("redirect:/swagger-ui.html");
    }
}
