package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    @GetMapping("/double")
    public int number(@RequestParam(value = "number", defaultValue = "0") int number){
        return number*2;
    }
}
