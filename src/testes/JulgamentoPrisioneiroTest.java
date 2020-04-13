package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classe.JulgamentoPrisioneiro;

class JulgamentoPrisioneiroTest {

	@Test
	void calculaPena_inocencia() {
		
		JulgamentoPrisioneiro julgamento = new JulgamentoPrisioneiro();
		
		int resultadoEsperado = 0;
		int resultadoObtido = julgamento.calculaPena("Inocente", "Inocente");
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	void calculaPena_condenacaoMutua() {
		
		JulgamentoPrisioneiro julgamento = new JulgamentoPrisioneiro();
		
		int resultadoEsperado = 5;
		int resultadoObtido = julgamento.calculaPena("Culpado", "Culpado");
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	void calculaPena_condenacaoIndividual() {
		
		JulgamentoPrisioneiro julgamento = new JulgamentoPrisioneiro();
		
		int resultadoEsperado = 10;
		int resultadoObtido = julgamento.calculaPena("Culpado", "Inocente");
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	void calculaPena_condenacaoCumplices() {
		
		JulgamentoPrisioneiro julgamento = new JulgamentoPrisioneiro();
		
		int resultadoEsperado = 1;
		int resultadoObtido = julgamento.calculaPena("Inocente", "Culpado");
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}



}

