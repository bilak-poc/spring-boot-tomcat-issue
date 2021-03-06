package com.github.bilakpoc.springboottomcatissue;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  
  @GetMapping("/hello")
  ResponseEntity<String> hello() {
    return ResponseEntity.ok("hello");
  }
}
