package com.example.testeIntesis.application.usescases.cliente;

import com.example.testeIntesis.domain.entities.ClienteEntity;
import com.example.testeIntesis.domain.repositories.ClienteRepository;

public class CriarClienteUseCase {
    private ClienteRepository clienteRepo;

    public CriarClienteUseCase(ClienteRepository clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public ClienteEntity executar(ClienteEntity cliente){
        return  clienteRepo.salvarCliente(cliente);
    }
}
