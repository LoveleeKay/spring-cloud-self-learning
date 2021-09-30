package com.llys.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldConsumerController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProviderInterface providerInterface;

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "server port=" + port + "  provider:" + providerInterface.helloWorld();
    }

    @GetMapping("/fail")
    public String fail() {
        return "server port=" + port + "  provider:" + providerInterface.failed();
    }
}
