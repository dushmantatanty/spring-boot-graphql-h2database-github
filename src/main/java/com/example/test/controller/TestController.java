package com.example.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tests")
public class TestController {

    @GetMapping({"", "/"})
    public List<String> getTests(){
        return ResponseEntity.ok(Arrays.asList("Prelims", "Mains", "Interview")).getBody();
    }

}
