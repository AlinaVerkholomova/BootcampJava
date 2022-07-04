package com.example.newdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home()
    {
        String str
                = "<html><body><font color=\"black\">"
                + "<h1>My first Spring Boot Application </h1>"
                + "</font></body></html>";
        return str;
    }

    @RequestMapping(
            method = { RequestMethod.GET },
            value = { "/mymapping" })

    public String info()
    {
        String str2
                = "<html><body><font color=\"black\">" +
                "<h2>This is my first mapping</h2>" +
                "</body></html>";
        return str2;
    }
}