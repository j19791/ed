package ed.listaligada;

public class TestaListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		System.out.println(lista);
		lista.adicionaNoComeco("mauricio");
		System.out.println("adiciona " + "mauricio" + lista);
		lista.adicionaNoComeco("paulo");
		System.out.println("adiciona " + "paulo" + lista);
		lista.adicionaNoComeco("guilherme");
		System.out.println("adiciona " + "guilherme" + lista);

		lista.adiciona("marcelo");
		System.out.println("adiciona " + "marcelo" + lista);

		lista.adiciona(2, "gabriel");
		System.out.println("adiciona " + "gabriel na posicao 2 " + lista);

		Object x = lista.pega(2);
		System.out.println("pegar o segundo elemento: " + x);

		System.out.println("tamanho: " + lista.tamanho());

		lista.removeDoComeco();
		System.out.println("remove do começo: " + lista);
	}
}