package com.lambretapa.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambretapa.cursomc.domain.Pagamento;
import com.lambretapa.cursomc.repository.PagamentoRepository;
import com.lambretapa.cursomc.service.exception.ObjectNotFoundException;

@Service
public class PagamentoService {

	@Autowired
	private PagamentoRepository repository;

	public Pagamento buscar(Integer id) {
		Optional<Pagamento> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pagamento.class.getName()));
	}
}
