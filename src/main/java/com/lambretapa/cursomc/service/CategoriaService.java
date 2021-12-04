package com.lambretapa.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambretapa.cursomc.domain.Categoria;
import com.lambretapa.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repository.findById(id).orElse(null);
		return obj;
	}
}
