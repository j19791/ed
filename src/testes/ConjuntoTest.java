package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ed.conjunto.Conjunto;

public class ConjuntoTest {

	@Test
	public void naoDeveraIncluirElementoRepetido() {

		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Mauricio");

		conjunto.adiciona("Mauricio");

		assertEquals(
				"[[], [], [], [], [], [Mauricio], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]",
				conjunto.toString());

	}

	@Test
	public void deveIncluirElementosDiferentes() {
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Mauricio");

		conjunto.adiciona("Guilherme");

		assertEquals(
				"[[], [], [], [], [], [Mauricio], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Guilherme]]",
				conjunto.toString());

	}

	@Test
	public void deveRemoverElementoDaLista() {
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Mauricio");

		conjunto.adiciona("Guilherme");

		conjunto.remove("Mauricio");
		assertEquals(
				"[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Guilherme]]",
				conjunto.toString());

	}

	@Test
	public void deveRetornarUmEstado() {

		Conjunto conjunto = new Conjunto();

		conjunto.adiciona("Mauricio");

		conjunto.adiciona("Mauricio");

		conjunto.adiciona("Guilherme");

		conjunto.adiciona("Paulo");

		conjunto.remove("Guilherme");

		assertEquals(
				"[[], [], [], [], [], [Mauricio], [], [], [Paulo], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]",
				conjunto.toString());

	}

}
