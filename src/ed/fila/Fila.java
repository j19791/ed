package ed.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> alunos = new LinkedList<String>();

	public void adiciona(String aluno) {
		alunos.add(aluno);
	}

	// na fila, sempre o primeiro elemento é o primeiro a ser removido
	public String remove() {
		return alunos.remove(0);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return alunos.toString();
	}

	public boolean vazia() {
		return alunos.isEmpty();
	}

}