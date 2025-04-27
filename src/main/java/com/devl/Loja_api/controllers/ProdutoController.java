package com.devl.Loja_api.controllers;


import com.devl.Loja_api.models.ProdutoModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @PostMapping
    public void salvarProduto(@RequestBody ProdutoModel produto){
        System.out.println("Produto Salvo: " + produto);
    }

}
