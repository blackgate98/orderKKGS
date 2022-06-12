package com.example.order.Client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;


    public List<Client> getALlClient(){
        return clientRepository.findAll();
    }

    public Optional<Client> getSingleClient(long id){
        return clientRepository.findById(id);
    }


    public Client addClient(Client client) {
        return clientRepository.save(client);
    }
}
