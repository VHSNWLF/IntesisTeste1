package com.example.testeIntesis.infrastructure.persistence.produto;

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
}
