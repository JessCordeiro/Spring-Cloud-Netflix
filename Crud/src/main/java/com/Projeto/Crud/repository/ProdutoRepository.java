package com.Projeto.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Projeto.Crud.entity.Produto;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
