package com.example.testeIntesis.infrastructure.persistence.produto;

import com.example.testeIntesis.domain.entities.ProdutoEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_produto")
public class ProdutoJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produto;
    private String nome;
    private float valor;

    public static ProdutoJpaEntity fromDomain(ProdutoEntity produto){
        ProdutoJpaEntity entity = new ProdutoJpaEntity();
        entity.id_produto = produto.getId_produto();
        entity.nome = produto.getNome();
        entity.valor = produto.getValor();
        return entity;
    }

    public ProdutoEntity toDomain(){
        return new ProdutoEntity(id_produto, nome, valor);
    }
}
