package com.jcasado.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/sample-messages")
public class SampleController {

    @Autowired
    private RouteConfig config;

    public SampleController(RouteConfig config) {
        this.config= config;
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @SuppressWarnings("unchecked")
    public String getMessages() {
        String message = config.getMessage();
        if(message == null){
            message = "No message";
        }
        return message;
    }
}