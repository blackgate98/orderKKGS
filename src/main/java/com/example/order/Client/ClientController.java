package com.example.order.Client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/get/all")
    public List<Client> getAllClient(){
        return clientService.getALlClient();
    }
    @GetMapping("/get/{id}")
    public Optional<Client> getSingleClient(@PathVariable  long id){
        return clientService.getSingleClient(id);
    }
    @PostMapping("/add")
    public Client postOrder(@RequestBody Client client){
        return clientService.addClient(client);
    }

}
