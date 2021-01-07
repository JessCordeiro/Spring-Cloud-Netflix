package com.Projeto.Pagamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Projeto.Pagamento.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}
