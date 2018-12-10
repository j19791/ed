package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ed.listaligada.ListaDuplamenteLigada;
import ed.listaligada.ListaLigada;

public class ListaTest {

	ListaLigada lista = new ListaLigada();
	ListaDuplamenteLigada listaDupla = new ListaDuplamenteLigada();

	@Test
	public void deveAdicionarNoComeco() {

		lista.adicionaNoComeco("mauricio");

		assertEquals("mauricio", lista.pega(0));
		assertEquals(1, lista.tamanho());

	}

	@Test
	public void deveRemoverDoMeio() {

		listaDupla.adiciona("mauricio");
		listaDupla.adiciona("cecilia");
		listaDupla.adiciona("jose");
		listaDupla.adiciona("joao");

		listaDupla.remove(2);

		assertEquals("joao", listaDupla.pega(2));
		assertEquals(3, listaDupla.tamanho());

	}

	@Test
	public void deveVerificarSeContem() {
		listaDupla.adiciona("mauricio");
		listaDupla.adiciona("cecilia");
		listaDupla.adiciona("jose");
		listaDupla.adiciona("joao");

		listaDupla.remove(2);

		// assertEquals("joao", listaDupla.contem("mauricio"));
		// assertEquals(false, listaDupla.contem("danilo"));

		assertTrue(listaDupla.contem("mauricio"));
		assertFalse(listaDupla.contem("danilo"));

	}

}
