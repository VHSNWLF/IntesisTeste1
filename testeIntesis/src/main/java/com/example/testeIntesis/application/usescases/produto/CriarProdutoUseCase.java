package com.example.testeIntesis.application.usescases.produto;

import com.example.testeIntesis.domain.entities.ProdutoEntity;
import com.example.testeIntesis.domain.repositories.ProdutoRepository;

public class CriarProdutoUseCase {
    private ProdutoRepository produtoRepo;

    public CriarProdutoUseCase(ProdutoRepository produtoRepo) {
        this.produtoRepo = produtoRepo;
    }

    public ProdutoEntity executar(ProdutoEntity produto){
        return  produtoRepo.salvarProduto(produto);
    }
}
