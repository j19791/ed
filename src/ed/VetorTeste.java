package ed;

public class VetorTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Jose");

		Vetor lista = new Vetor();

		System.out.println(lista.tamanho());
		lista.adiciona(a1);
		System.out.println(lista.tamanho());
		lista.adiciona(a2);
		System.out.println(lista.tamanho());

		System.out.println(lista);
		System.out.println(lista.contem(a1));
		System.out.println(lista.contem(new Aluno("Pedro")));

		Aluno x = lista.pega(1); // pega na posição 1. lembrando que o array começa com 0
		System.out.println(x);

		// Aluno y = lista.pega(500); testando lançamento da exception

		Aluno a3 = new Aluno("Maria");

		lista.adiciona(a3);

		System.out.println(lista);

		lista.remove(1);

		System.out.println(lista);

	}

}
