package ed.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//nao pode ter elemtnos repetidos
public class Conjunto {

	// dividiria o array em 26 pedaços - cada pedaço representa a letra inicial do
	// String: utilizado p/ verificar se o cojunto ja contem o elemnto
	// private LinkedList<LinkedList<String>> tabela = new
	// LinkedList<LinkedList<String>>();

	// é mais rapido pegar elemento aleatório
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

	public Conjunto() {// criação das 26 listas, representando cada uma letra do alfabeto

		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}

	// espalhamento dos dados e retorna sempre o mesmo índice dos elementos que
	// possuam a mesma letra inicial.
	private int calculaIndiceDaTabela(String palavra) {// A=0, b=1
		return palavra.toLowerCase().charAt(0) % 26;
	}

	public void adiciona(String palavra) {

		if (!contem(palavra)) {
			int indice = calculaIndiceDaTabela(palavra);// indice correspondente a palavra passada
			List<String> lista = tabela.get(indice);// retorna a lista especifica daquele indice
			lista.add(palavra);// adiciona na lista especifica, aquelas palavras que começam com a mesma letra
		}
	}

	// para garantir q o conjunto não tenha elementos repetidos de uma forma mais
	// otimizada
	private boolean contem(String palavra) {
		int indice = calculaIndiceDaTabela(palavra);
		return tabela.get(indice).contains(palavra);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tabela.toString();
	}

	public void remove(String palavra) {
		if (contem(palavra)) {
			int indice = calculaIndiceDaTabela(palavra);
			List<String> lista = tabela.get(indice);
			lista.remove(palavra);
		}
	}
}
