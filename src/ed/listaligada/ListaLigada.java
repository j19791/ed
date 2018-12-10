package ed.listaligada;

public class ListaLigada extends Lista implements Listavel {

	@Override
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeira); // no começo, o objeto sempre apronta p/primeira celula da lista
		this.primeira = nova;

		if (this.totalDeElementos == 0) { // qdo a lista esta vazia, o último elemnto é igual ao primeiro
			this.ultima = this.primeira;
		}

		this.totalDeElementos++;
	}

	public void adiciona(Object elemento) {

		if (this.totalDeElementos == 0) {// se a lista esta vazia, adiciona no começo
			adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento, null);
			this.ultima.setProximo(nova); // o ultimo elemento aponta para o novo elemnto
			this.ultima = nova; // o último elemento agora é o novo
			this.totalDeElementos++;
		}

	}

	public void adiciona(int posicao, Object elemento) {

		if (posicao == 0) { // posicao 0, insere no inicio
			adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) { // posicao última
			adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1); // pega a celula anterior
			Celula nova = new Celula(elemento, anterior.getProximo());// a celula nova aponta para aquela celula que a
																		// anterior apontava
			anterior.setProximo(nova);// a anterior agora aponta p/ nova
			this.totalDeElementos++;
		}
	}

	public void remove(int posicao) {
	}

	public boolean contem(Object o) {
		return false;
	}

	@Override
	public String toString() {

		if (this.totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = primeira;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");

			atual = atual.getProximo();
		}

		builder.append("]");

		return builder.toString();
	}

	@Override
	public void removeDoFim() {
		// TODO Auto-generated method stub

	}

}
