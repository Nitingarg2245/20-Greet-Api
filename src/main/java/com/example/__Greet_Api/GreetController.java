package com.example.__Greet_Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    private Environment environment;
    @GetMapping("/greet")
    public String getGreetings(){
        String port = environment.getProperty("server.port");
        return "Good morning at port:"+port;
    }
}
