package com.example.DeployEnvironmentsVariables02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @Value("${myCustomVarTree.welcomeMsg}")
    String welcomeMsg;
    @GetMapping("/getMessage")
    public String getWelcomeMsg(){
        return welcomeMsg;
    }
}
