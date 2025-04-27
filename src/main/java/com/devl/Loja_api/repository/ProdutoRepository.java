package com.devl.Loja_api.repository;

import com.devl.Loja_api.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, String> {
}
