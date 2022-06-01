package com.techprimers.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/helloEmily")
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello TechPrimers";
    }
}
