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

}
