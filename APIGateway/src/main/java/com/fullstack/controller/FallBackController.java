package com.fullstack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallBackController {

    @GetMapping("/employeefallback")
    public ResponseEntity<String> employeeFallBack(){
        return new ResponseEntity<>("Employee Service is Down Please Wait !!!", HttpStatus.OK);
    }

    @GetMapping("/departmentfallback")
    public ResponseEntity<String> departmentFallBack(){
        return new ResponseEntity<>("Department Service is Down Please Wait !!!", HttpStatus.OK);
    }
}
