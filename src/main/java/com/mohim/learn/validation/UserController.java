package com.mohim.learn.validation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/test/")
public class UserController {


    @RequestMapping(value = "/test")
    public String test(@Valid User user){
        return "valid";
    }

}
