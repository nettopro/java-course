package github.nettopro.exercises_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import github.nettopro.exercises_sb.model.entities.Client;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    @GetMapping(path = "/any")
    public Client getClient(){
        return new Client(28, "John", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Client getClienteById1(@PathVariable int id) {
        return new Client(id, "Mary", "300.234.121-00");
    }

    @GetMapping
    public Client getClientById2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Client(id, "John", "222.333.123-45");
    }
}
