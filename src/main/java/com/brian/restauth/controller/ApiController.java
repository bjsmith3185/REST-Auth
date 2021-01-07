package com.brian.restauth.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableWebSecurity
public class ApiController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String healthCheck()
    {

        return "you have access";
    }
}
