package com.example.testeIntesis.application.usescases.cliente;

import com.example.testeIntesis.domain.entities.ClienteEntity;
import com.example.testeIntesis.domain.repositories.ClienteRepository;

import java.util.Optional;

public class ConsultarClientePorIDUseCase {
    private ClienteRepository clienteRepo;

    public ConsultarClientePorIDUseCase(ClienteRepository clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public Optional<ClienteEntity> executar(int id){
        return clienteRepo.consultarClientePorID(id);
    }
}
