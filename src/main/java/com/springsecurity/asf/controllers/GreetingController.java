package com.springsecurity.asf.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greetings")
public class GreetingController {

    @GetMapping("/hello")
    ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from our API !");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> sayBye() {
        return ResponseEntity.ok("Good bye, see you later !");
    }
}
