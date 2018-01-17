package com.example.contoller;

import com.example.service.inf.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(HelloController.class.getName());

    @Autowired
    private HelloService helloService;


    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    public String getInfo() {
        logger.info("get info");
        return helloService.getInfo();
    }

}
