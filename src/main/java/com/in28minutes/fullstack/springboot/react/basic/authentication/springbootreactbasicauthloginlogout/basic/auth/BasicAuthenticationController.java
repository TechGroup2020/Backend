package com.in28minutes.fullstack.springboot.react.basic.authentication.springbootreactbasicauthloginlogout.basic.auth;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins={ "http://localhost:3000", "http://localhost:4200", "http://localhost:8081","http://localhost:8080" ,"http://10.0.0.107:8080,","http://10.0.1.39:8080," })
@RestController
public class BasicAuthenticationController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorldBean() {
        //throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
        return new AuthenticationBean("You are authenticated");
    }   
}