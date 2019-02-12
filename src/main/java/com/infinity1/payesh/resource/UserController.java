package com.infinity1.payesh.resource;

import com.infinity1.payesh.domain.ValContainer;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/post")
    private String getName(@RequestBody String name) {
        System.out.println(name);
        return name;
    }

    @PostMapping("/post/trigon")
    private double getVal(@RequestBody ValContainer valContainer) {
        System.out.println(valContainer.getVal());
        return Math.sin(valContainer.getVal()*Math.PI/180);
    }
}

