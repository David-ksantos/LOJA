package com.devl.Loja_api.repository;

import com.devl.Loja_api.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, String> {
    Optional<ProdutoModel> findByNome(String nome);
}
