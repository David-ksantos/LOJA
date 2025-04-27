package com.devl.Loja_api.controllers;


import com.devl.Loja_api.models.ProdutoModel;
import com.devl.Loja_api.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    /*@PostMapping("/return")
    public ProdutoModel produto(@RequestBody  ProdutoModel produto){
        return produto;
    }*/
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }



    //REGRA - gerar o id antes de salvar o produto, id = Primary key

    @PostMapping
    public void salvarProduto(@RequestBody ProdutoModel produto){
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);//persistência de dados
        System.out.println("Produto Salvo: " + produto);
    }


}
