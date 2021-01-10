package com.brian.restauth.controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String entryRoute() {
        System.out.println("in the entry route");
        return "access to the entry route";
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String testRoute() {
        System.out.println("in the test route");
        return "access to the test route";
    }


//    // added
//    @RequestMapping(value="/logout", method = RequestMethod.POST)
//    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth != null){
//            new SecurityContextLogoutHandler().logout(request, response, auth);
//        }
//        System.out.println("logged out");
//        return "logged out";
//    }


}