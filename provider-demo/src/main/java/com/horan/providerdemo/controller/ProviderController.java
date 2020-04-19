package com.horan.providerdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @RequestMapping("/hello")
    public String demo() {
        return "provider success!";
    }
}
