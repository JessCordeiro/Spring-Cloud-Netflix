package com.Projeto.Pagamento.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Projeto.Pagamento.entity.ProdutoVenda;

@Repository
public interface ProdutoVendaRepository  extends JpaRepository<ProdutoVenda, Long>{

}
