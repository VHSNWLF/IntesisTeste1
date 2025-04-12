package com.example.testeIntesis.application.usescases.cliente;

import com.example.testeIntesis.domain.entities.ClienteEntity;
import com.example.testeIntesis.domain.repositories.ClienteRepository;

import java.util.List;

public class ConsultarTodosClientesUseCase {
    private ClienteRepository clienteRepo;

    public ConsultarTodosClientesUseCase(ClienteRepository clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public List<ClienteEntity> executar(){
        return clienteRepo.consultarTodosClientes();
    }
}
