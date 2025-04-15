package com.example.testeIntesis.infrastructure.persistence.cliente;

import com.example.testeIntesis.domain.entities.ClienteEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cliente")
public class ClienteJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int id_produto;
    private float total_venda;
    private String cpf;
    private int qtde_produto;

    public static ClienteJpaEntity fromDomain(ClienteEntity cliente){
            ClienteJpaEntity entity = new ClienteJpaEntity();
            entity.id = cliente.getId();
            entity.nome = cliente.getNome();
            entity.cpf = cliente.getCpf();
            entity.id_produto = cliente.getId_produto();
            entity.qtde_produto = cliente.getQtde_produto();
            entity.total_venda = cliente.getTotal_venda();
            return entity;
    }

    public ClienteEntity toDomain(){
        return new ClienteEntity(id, nome, id_produto, total_venda, cpf, qtde_produto);
    }
}
