package com.horan.consumerdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {



    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate; // HTTP 访问操作类

    @RequestMapping("/customer")
    public String customer() {
        String providerMsg = restTemplate.getForEntity("http://PROVIDER-A/hello",
                String.class).getBody();
        return "Hello,Customer! msg from provider : <br/><br/> " + providerMsg;
    }


}
