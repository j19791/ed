package testes;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class QueueTest {

	@Test
	public void deveTestarQueue() {

		Queue<String> fila = new LinkedList<String>();

		fila.add("Mauricio");
		fila.add("Paulo");
		fila.add("Guilherme");
		fila.poll();
		fila.add("João");
		fila.poll();
		assertEquals("[Guilherme, João]", fila.toString());

	}

}
