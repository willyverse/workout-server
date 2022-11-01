package com.demo.workout.controller;

import com.demo.workout.dto.HelloDto;
import com.demo.workout.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public List<HelloDto> hello() {
        return helloService.hello();
    }
}
