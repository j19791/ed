package testes;

import java.util.Stack;

public class testaPilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack();

		pilha.push("Mauricio");
		pilha.push("Marcelo");
		pilha.pop();
		pilha.push("Guilherme");
		pilha.push("Paulo");
		pilha.pop();
		pilha.push("João");

		System.out.println(pilha.toString());

	}

}
