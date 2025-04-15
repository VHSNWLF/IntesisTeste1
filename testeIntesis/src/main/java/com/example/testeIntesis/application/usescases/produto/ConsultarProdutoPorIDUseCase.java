package com.example.testeIntesis.application.usescases.produto;

import com.example.testeIntesis.domain.entities.ProdutoEntity;
import com.example.testeIntesis.domain.repositories.ProdutoRepository;

import java.util.Optional;

public class ConsultarProdutoPorIDUseCase {
    private ProdutoRepository produtoRepo;

    public ConsultarProdutoPorIDUseCase(ProdutoRepository produtoRepo) {
        this.produtoRepo = produtoRepo;
    }

    public Optional<ProdutoEntity> executar(int id){
        return produtoRepo.consultarProdutoPorID(id);
    }
}
