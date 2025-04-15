package com.example.testeIntesis.application.usescases.produto;

import com.example.testeIntesis.domain.entities.ProdutoEntity;
import com.example.testeIntesis.domain.repositories.ProdutoRepository;

import java.util.Optional;

public class ExcluirProdutoPorIDUseCase {
    private ProdutoRepository produtoRepo;

    public ExcluirProdutoPorIDUseCase(ProdutoRepository produtoRepo) {
        this.produtoRepo = produtoRepo;
    }

    public  executar(int id){
        produtoRepo.excluirProdutoPorID(id);
    }
}
