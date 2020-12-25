package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;


@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "welcome to spring boot";
    }

}
