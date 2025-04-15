package com.example.testeIntesis.application.usescases.cliente;

import com.example.testeIntesis.domain.entities.ClienteEntity;
import com.example.testeIntesis.domain.repositories.ClienteRepository;

import java.util.Optional;

public class ExcluirClientePorIDUseCase {
    private ClienteRepository clienteRepo;

    public ExcluirClientePorIDUseCase(ClienteRepository clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public void executar(int id){
        clienteRepo.excluirClientePorID(id);
    }
}
