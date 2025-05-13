package github.nettopro.exercises_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(path = {"hello","greetings"})
    public String hello() {
        return "Hello Spring Boot!";
    }
}
