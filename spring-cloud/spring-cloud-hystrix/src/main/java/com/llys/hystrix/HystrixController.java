package com.llys.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HystrixController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackMethod1")
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "HystrixController:  " + restTemplate.getForObject("http://spring-cloud-eureka-provider/hello-world", String.class);
    }

    public String fallbackMethod1() {
        return "HystrixController: 服务调用失败";
    }
}
