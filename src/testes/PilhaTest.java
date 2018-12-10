package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

import ed.pilha.Pilha;

public class PilhaTest {

	@Test
	public void deveraInserirNaPilha() {

		Pilha pilha = new Pilha();

		pilha.insere("Mauricio");

		assertEquals(true, pilha.nomes.contains("Mauricio"));

		assertEquals(1, pilha.nomes.size());

		assertEquals("[Mauricio]", pilha.toString());

		pilha.insere("Guilherme");

		assertEquals(true, pilha.nomes.contains("Guilherme"));

		assertEquals(2, pilha.nomes.size());

		assertEquals("[Mauricio, Guilherme]", pilha.toString());

	}

	@Test
	public void deveraRemoverNoFimDaPilha() {

		Pilha pilha2 = new Pilha();

		assertEquals("[]", pilha2.toString());

		pilha2.insere("Mauricio");
		pilha2.insere("Guilherme");

		assertEquals("Guilherme", pilha2.remove());

		assertEquals("Mauricio", pilha2.remove());

		//

		//

		assertEquals("[]", pilha2.toString());
	}

	@Test
	public void deveEstarVazia() {

		Pilha pilha = new Pilha();

		assertTrue(pilha.vazia());

		pilha.insere("Guilherme");

		assertFalse(pilha.vazia());

	}

	@Test
	public void deveTestarStack() {

		Stack<String> stack = new Stack<String>();
		stack.push("Mauricio");// insere na pilha no fim
		stack.push("Marcelo");// insere na pilha no fim

		assertEquals("Marcelo", stack.peek()); // retorna o ultimo elemento da lista

		assertEquals("[Mauricio, Marcelo]", stack.toString());

		stack.pop(); // remove o ultimo elemento da losta

		assertEquals("[Mauricio]", stack.toString());

	}

}
