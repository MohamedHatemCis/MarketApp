package com.cisteam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class loginController {


    /////////////////////For Admins*********************
    @RequestMapping(value = "/startAdmin" ,method = RequestMethod.GET)
    public String start(){
        return "startpage";
    }

    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String login(){
        return "login";
    }


    ////////////////////for Users ****************
    @RequestMapping(value = "/start" ,method = RequestMethod.GET)
    public String startpage(){
        return "user_startpage";
    }

}
