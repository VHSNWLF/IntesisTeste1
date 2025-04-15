package com.example.testeIntesis.domain.repositories;

import com.example.testeIntesis.domain.entities.ClienteEntity;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository {
    ClienteEntity salvarCliente(ClienteEntity cliente);
    Optional<ClienteEntity> consultarClientePorID(int id);
    List<ClienteEntity> consultarTodosClientes();
    void excluirClientePorID(int id);
    ClienteEntity editarCliente(ClienteEntity cliente);
}
