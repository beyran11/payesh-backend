package com.infinity1.payesh.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    private String helloWorld() {
        return "hello world";
    }

    @GetMapping("/add")
    private int NumCalc(){
        return 1+1;
    }

    @GetMapping("/trigon")
    private double trigon(){
        return Math.sin(Math.PI/2);
    }


}

