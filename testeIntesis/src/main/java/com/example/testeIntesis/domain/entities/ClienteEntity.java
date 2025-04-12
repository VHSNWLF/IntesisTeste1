package com.example.testeIntesis.domain.entities;

public class ClienteEntity {
    private String nome;
    private int id_produto;
    private float total_venda;
    private String cpf;
    private int qtde_produto;

    public ClienteEntity() {
    }

    public ClienteEntity(String nome, int id_produto, float total_venda, String cpf, int qtde_produto) {
        this.nome = nome;
        this.id_produto = id_produto;
        this.total_venda = total_venda;
        this.cpf = cpf;
        this.qtde_produto = qtde_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public float getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(float total_venda) {
        this.total_venda = total_venda;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQtde_produto() {
        return qtde_produto;
    }

    public void setQtde_produto(int qtde_produto) {
        this.qtde_produto = qtde_produto;
    }
}
