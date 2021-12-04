package com.lambretapa.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambretapa.cursomc.domain.Produto;
import com.lambretapa.cursomc.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public Produto buscar(Integer id) {
		Produto obj = repository.findById(id).orElse(null);
		return obj;
	}
}
