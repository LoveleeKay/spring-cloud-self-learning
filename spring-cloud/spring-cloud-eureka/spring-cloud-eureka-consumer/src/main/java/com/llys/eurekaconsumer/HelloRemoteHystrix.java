package com.llys.eurekaconsumer;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements ProviderInterface{

    @Override
    public String helloWorld() {
        return "hello , this messge send failed ";
    }

    @Override
    public String failed() {
        return "failed";
    }
}
