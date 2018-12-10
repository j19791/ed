package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ed.fila.Fila;

public class TestaFila {

	Fila fila = new Fila();

	@Before
	public void adicionaNaFila() {

		fila.adiciona("Mauricio");
		fila.adiciona("Guilherme");
	}

	@Test
	public void deveInserirNaFila() {

		assertEquals("[Mauricio, Guilherme]", fila.toString());

	}

	@Test
	public void deveRemovernoIniciodaFila() {

		fila.remove();

		assertEquals("[Guilherme]", fila.toString());

		fila.remove();

		assertEquals("[]", fila.toString());

	}

}
