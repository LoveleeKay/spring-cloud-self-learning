package com.llys.eurekaprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${server.port}")
    private String port;
    @GetMapping("hello-world")
    public String helloWorld(){
        return "hello world, port=" + port;
    }

    @GetMapping("/hello-world/a")
    public String helloWorldA(){
        return "hello world a, port=" + port;
    }
}
