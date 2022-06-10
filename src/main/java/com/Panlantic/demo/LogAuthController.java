package com.Panlantic.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogAuthController {


    @PostMapping(value="/logauth")
    public ResponseEntity<String> logOuter(@RequestBody String k) {
        System.out.println(k);
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }
}