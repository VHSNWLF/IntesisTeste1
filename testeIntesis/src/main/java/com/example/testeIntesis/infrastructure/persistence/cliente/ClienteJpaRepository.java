package com.example.testeIntesis.infrastructure.persistence.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteJpaRepository extends JpaRepository<ClienteJpaEntity, Integer> {
}
