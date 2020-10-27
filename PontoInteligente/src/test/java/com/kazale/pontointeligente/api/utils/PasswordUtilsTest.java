package com.kazale.pontointeligente.api.utils;

import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {

	private static final String SENHA = "123456";
//	private final BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
	
	@Test
	public void testSenhaNula() throws Exception {
		assertNull(PasswordUtils.gerarBCrypt(null));
	}
	
//	@Test
//	public void testGerarSenhaHash() throws Exception {
//		String hash = PasswordUtils.gerarBCrypt(SENHA);
//		assertTrue(bCryptEncoder.matches(SENHA, hash));
//	}
	
	
	public static void main(String[] args) {
		
		String texto = "Sem Etapa - Motivo: 13232116416540646406546049449749565406540654654065";
		System.out.println(texto.indexOf("Motivo: "));
		System.out.println(texto.substring(texto.indexOf("Motivo: ")+8));
		
	}
	
}
