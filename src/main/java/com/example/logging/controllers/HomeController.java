package com.example.logging.controllers;

import com.example.logging.services.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

    @Autowired
    HomeService homeService;

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public void welcome(){
        logger.info("welcome");
    }

    @GetMapping("/exp")
    public Double getExponent(){
        return homeService.calculateExponent();
    }

    @GetMapping("/get-errors")
    public void getError(){
        logger.error("this is a error logging");
    }
}
