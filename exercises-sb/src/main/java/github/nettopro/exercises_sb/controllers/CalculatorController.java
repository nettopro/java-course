package github.nettopro.exercises_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    @GetMapping("/sum/{a}/{b}")
    public double getNumber(@PathVariable int a, @PathVariable int b) {
        return a+b;
    }

    @GetMapping("/subtract")
    public double getClientById2(@RequestParam double a, @RequestParam double b) {
        return a-b;
    }
}
