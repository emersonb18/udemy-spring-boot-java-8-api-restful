package com.kazale.pontointeligente.api.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.kazale.pontointeligente.api.entities.Lancamento;
import com.kazale.pontointeligente.api.repositories.LancamentoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class LancamentoServiceTest {

	@MockBean
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private LancamentoService lancamentoService;
	
	@Before
	public void setUp() throws Exception {
		BDDMockito.given(this.lancamentoService.buscaPorFuncionarioId(Mockito.anyLong())).willReturn(new ArrayList<Lancamento>());
		BDDMockito.given(this.lancamentoService.buscaPorFuncionarioId(Mockito.anyLong(), Mockito.any())).willReturn(new PageImpl<Lancamento>(new ArrayList<Lancamento>()));
		BDDMockito.given(this.lancamentoService.buscaPorId(Mockito.anyLong())).willReturn(Optional.ofNullable(new Lancamento()));
		BDDMockito.given(this.lancamentoService.persistir(Mockito.any())).willReturn(new Lancamento());
	}

	@Test
	public void testPageBuscaFuncionarioPorId() {
		PageRequest pageRequest = PageRequest.of(0, 10, Sort.Direction.ASC, "id");
		Page<Lancamento> lancamento = this.lancamentoService.buscaPorFuncionarioId(1L, pageRequest);
		assertNotNull(lancamento);
	}
	

	@Test
	public void testBuscaFuncionarioPorId() {
		List<Lancamento> lancamento = this.lancamentoService.buscaPorFuncionarioId(1L);
		assertNotNull(lancamento);
	}
	
	@Test
	public void testBuscaLancamentoPorId() {
		Optional<Lancamento> lancamento = this.lancamentoService.buscaPorId(1L);
		assertTrue(lancamento.isPresent());
	}
	
	@Test
	public void testPersistirLancamento() {
		Lancamento lancamento = this.lancamentoService.persistir(new Lancamento());
		assertNotNull(lancamento);
	}
	
}
