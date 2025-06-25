package org.botnicholas.projects.demoredirection.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

@RestController
@CrossOrigin("*")
public class MainController {
    @GetMapping("/redirect-me")
    public RedirectView redirectMe() {
        return new RedirectView("http://93.116.234.164:8080/give-me-five");
    }

    @GetMapping("/give-me-five")
    public ResponseEntity<Map<String, String>> giveMeFive() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(Map.of("five", "5"));
    }
}
