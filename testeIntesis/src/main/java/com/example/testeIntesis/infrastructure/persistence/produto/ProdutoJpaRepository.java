package com.example.testeIntesis.infrastructure.persistence.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoJpaRepository extends JpaRepository<ProdutoJpaEntity, Integer> {
}
