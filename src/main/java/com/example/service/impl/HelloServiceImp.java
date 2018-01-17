package com.example.service.impl;

import com.example.service.inf.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImp implements HelloService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String getInfo() {
        return restTemplate.getForObject("http://COMPUTE-SERVICE/getInfo", String.class);
    }
}
