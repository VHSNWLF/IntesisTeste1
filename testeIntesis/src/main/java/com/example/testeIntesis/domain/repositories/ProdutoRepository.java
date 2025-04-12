package com.example.testeIntesis.domain.repositories;

import com.example.testeIntesis.domain.entities.ProdutoEntity;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository {
    ProdutoEntity salvarProduto(ProdutoEntity produto);
    Optional<ProdutoEntity> consultarProdutoPorID(int id);
    List<ProdutoEntity> consultarTodosProdutos();
    Optional<ProdutoEntity> excluirProdutoPorID(int id);
    ProdutoEntity editarProduto(ProdutoEntity produto);
}
