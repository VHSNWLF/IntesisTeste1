package com.example.testeIntesis.web.controllers.cliente;

import com.example.testeIntesis.application.usescases.cliente.CriarClienteUseCase;
import com.example.testeIntesis.domain.entities.ClienteEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private CriarClienteUseCase useCase;

    public ClienteController(CriarClienteUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping("/save")
    public ClienteEntity criar(@RequestBody ClienteRequest request){
        //transformando um ClienteRequest em um ClienteEntity
        ClienteEntity cliente = new ClienteEntity(
                request.id(),
                request.nome(),
                request.id_produto(),
                request.total_venda(),
                request.cpf(),
                request.qtde_produto()
        );
        return useCase.executar(cliente);
    }

    record ClienteRequest(int id, String nome, int id_produto, float total_venda, String cpf, int qtde_produto){}
}