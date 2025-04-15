package com.example.testeIntesis.infrastructure.persistence.cliente;

import com.example.testeIntesis.domain.entities.ClienteEntity;
import com.example.testeIntesis.domain.repositories.ClienteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository{
    private ClienteJpaRepository jpaRepo;

    public ClienteRepositoryImpl(ClienteJpaRepository jpaRepo) {
        this.jpaRepo = jpaRepo;
    }

    @Override
    public ClienteEntity salvarCliente(ClienteEntity cliente) {
        var entity = ClienteJpaEntity.fromDomain(cliente);
        return jpaRepo.save(entity).toDomain();

    }

    @Override
    public Optional<ClienteEntity> consultarClientePorID(int id) {
        return jpaRepo.findById(id).map(ClienteJpaEntity::toDomain);
    }

    @Override
    public List<ClienteEntity> consultarTodosClientes() {
        return jpaRepo.findAll().stream().map(ClienteJpaEntity::toDomain).toList();
    }

    @Override
    public void excluirClientePorID(int id) {
        jpaRepo.deleteById(id);
    }

    @Override
    public ClienteEntity editarCliente(ClienteEntity cliente) {
        var entity = ClienteJpaEntity.fromDomain(cliente);
        return jpaRepo.save(entity).toDomain();
    }
}
