package com.example.testeIntesis.application.usescases.produto;

import com.example.testeIntesis.domain.entities.ProdutoEntity;
import com.example.testeIntesis.domain.repositories.ProdutoRepository;

import java.util.List;

public class ConsultarTodosProdutosUseCase {
    private ProdutoRepository produtoRepo;

    public ConsultarTodosProdutosUseCase(ProdutoRepository produtoRepo) {
        this.produtoRepo = produtoRepo;
    }

    public List<ProdutoEntity> executar(){
        return produtoRepo.consultarTodosProdutos();
    }
}
