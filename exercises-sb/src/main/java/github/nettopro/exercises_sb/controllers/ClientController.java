package github.nettopro.exercises_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.nettopro.exercises_sb.models.Client;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    @GetMapping(path = "/any")
    public Client getClient(){
        return new Client(28, "John", "123.456.789-00");
    }
}
