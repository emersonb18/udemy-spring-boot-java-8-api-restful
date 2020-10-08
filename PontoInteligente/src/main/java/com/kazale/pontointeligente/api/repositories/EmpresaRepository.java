package com.kazale.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kazale.pontointeligente.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpj(String cnpj);
	
}
