package com.example.testeIntesis.infrastructure.persistence.produto;

import com.example.testeIntesis.domain.entities.ProdutoEntity;
import com.example.testeIntesis.domain.repositories.ProdutoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoJpaImpl implements ProdutoRepository {
    private ProdutoJpaRepository jpaRepo;

    @Override
    public ProdutoEntity salvarProduto(ProdutoEntity produto) {
        var entity = ProdutoJpaEntity.fromDomain(produto);
        return jpaRepo.save(entity).toDomain();
    }

    @Override
    public Optional<ProdutoEntity> consultarProdutoPorID(int id) {
        return jpaRepo.findById(id).map(ProdutoJpaEntity::toDomain);
    }

    @Override
    public List<ProdutoEntity> consultarTodosProdutos() {
        return jpaRepo.findAll().stream().map(ProdutoJpaEntity::toDomain).toList();
    }

    @Override
    public void excluirProdutoPorID(int id) {
        jpaRepo.deleteById(id);
    }

    @Override
    public ProdutoEntity editarProduto(ProdutoEntity produto) {
        var entity = ProdutoJpaEntity.fromDomain(produto);
        return jpaRepo.save(entity).toDomain();
    }
}
