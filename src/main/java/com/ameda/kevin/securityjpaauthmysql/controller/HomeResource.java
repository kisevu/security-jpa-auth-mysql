package com.ameda.kevin.securityjpaauthmysql.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeResource {

    @GetMapping("/")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from our API");
    }
    @GetMapping("/user")
    public ResponseEntity<String> user(){
        return ResponseEntity.ok("Hello user");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> admin(){
        return ResponseEntity.ok("Hello admin");
    }
}
