package ed.listaligada;

public class Lista {

	protected Celula primeira = null; // lista vazia - aponta p/ null
	protected int totalDeElementos = 0;

	protected Celula ultima = null; // elemento é o último da lista qdo ele aponta p/null

	protected Celula pegaCelula(int posicao) {

		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao inexistente");
		}

		Celula atual = primeira;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	public Object pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao inexistente");
		}

		return pegaCelula(posicao).getElemento();
	}

	public void removeDoComeco() {
		if (this.totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
		}

		this.primeira = this.primeira.getProximo();// o primeiro elemento deverá ser o segundo da lista
		this.totalDeElementos--;

		if (this.totalDeElementos == 0) {// se a lista ficar vazia, o ultimo deverá ser nulo
			this.ultima = null;
		}
	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object elemento) {
		Celula atual = this.primeira;

		while (atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	}

}
