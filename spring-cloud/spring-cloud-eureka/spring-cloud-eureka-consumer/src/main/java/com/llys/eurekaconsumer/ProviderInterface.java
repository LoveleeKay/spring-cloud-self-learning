package com.llys.eurekaconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="spring-cloud-eureka-provider", fallback = HelloRemoteHystrix.class)
public interface ProviderInterface {
    @GetMapping("/hello-world")
    String helloWorld();

    @GetMapping("/fail")
    String failed();
}
