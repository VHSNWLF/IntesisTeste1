package com.example.testeIntesis.application.usescases.cliente;

import com.example.testeIntesis.domain.entities.ClienteEntity;
import com.example.testeIntesis.domain.repositories.ClienteRepository;

public class EditarClienteUseCase {
    private ClienteRepository clienteRepo;

    public EditarClienteUseCase(ClienteRepository clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public ClienteEntity executar(ClienteEntity cliente){
        return clienteRepo.editarCliente(cliente);
    }
}
