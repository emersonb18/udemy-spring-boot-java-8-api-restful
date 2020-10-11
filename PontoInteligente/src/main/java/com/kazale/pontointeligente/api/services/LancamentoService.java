package com.kazale.pontointeligente.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.kazale.pontointeligente.api.entities.Lancamento;

public interface LancamentoService {

	List<Lancamento> buscaPorFuncionarioId(Long funcionarioId);
	
	Page<Lancamento> buscaPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);
	
	Optional<Lancamento> buscaPorId(Long id);
	
	Lancamento persistir(Lancamento lancamento);
	
	void remover(Long id);
	
	
}
