package com.utbm.fr.lo54.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController{

    @GetMapping(value="/")
    public String home(){

        return "home";
    }
}