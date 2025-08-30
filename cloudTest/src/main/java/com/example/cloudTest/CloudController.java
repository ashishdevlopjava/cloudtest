
package com.example.cloudTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @GetMapping("/hello")
    public String getHello(){
       return "Hello!!! Welcome to cloud World";
    }

}

