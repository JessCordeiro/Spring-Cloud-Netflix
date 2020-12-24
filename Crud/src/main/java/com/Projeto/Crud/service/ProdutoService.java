package com.Projeto.Crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Projeto.Crud.data.vo.ProdutoVO;
import com.Projeto.Crud.repository.ProdutoRepository;

@Service
public class ProdutoService {
	private final ProdutoRepository produtoRepository;

	@Autowired
	public ProdutoService(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}
	public ProdutoVO create(ProdutoVO produtoVO) {
		return null;
	}
}
