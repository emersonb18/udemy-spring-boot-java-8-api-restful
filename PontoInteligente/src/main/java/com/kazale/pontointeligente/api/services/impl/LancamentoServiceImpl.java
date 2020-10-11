package com.kazale.pontointeligente.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.kazale.pontointeligente.api.entities.Lancamento;
import com.kazale.pontointeligente.api.repositories.LancamentoRepository;
import com.kazale.pontointeligente.api.services.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService {

	private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Override
	public List<Lancamento> buscaPorFuncionarioId(Long funcionarioId) {
		log.info("buscaPorFuncionarioId");
		return lancamentoRepository.findByFuncionarioId(funcionarioId);
	}

	@Override
	public Page<Lancamento> buscaPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
		log.info("buscaPorFuncionarioId");
		return lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest);
	}

	@Override
	public Optional<Lancamento> buscaPorId(Long id) {
		log.info("buscaPorId");
		return lancamentoRepository.findById(id);
	}

	@Override
	public Lancamento persistir(Lancamento lancamento) {
		log.info("persistir");
		return lancamentoRepository.save(lancamento);
	}

	@Override
	public void remover(Long id) {
		log.info("remover");
		lancamentoRepository.deleteById(id);
	}

}
