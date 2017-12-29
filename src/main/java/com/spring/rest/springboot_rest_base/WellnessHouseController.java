package com.spring.rest.springboot_rest_base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellnessHouseController {

    @RequestMapping("/sayhello")
    public String greeting(){
        return "Hello, World";
    }
}
