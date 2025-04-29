package com.devl.Loja_api.controllers;


import com.devl.Loja_api.models.ProdutoModel;
import com.devl.Loja_api.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

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
    @GetMapping("/nome/{nome}")
    public ProdutoModel pegarProdutoPorNome(@PathVariable String nome){
        Optional<ProdutoModel> res = produtoRepository.findByNome(nome);
        return res.isPresent()? res.get(): null;
    }


    @GetMapping("/id/{id}")
    public ProdutoModel pegarProdutoPorId(@PathVariable String id){
        Optional<ProdutoModel> res = produtoRepository.findById(id);
        return res.isPresent() ? res.get() : null;
    }
}
