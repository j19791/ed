package ed.listaligada;

public class ListaDuplamenteLigada extends Lista implements Listavel {

	@Override
	public void adicionaNoComeco(Object elemento) {
		if (this.totalDeElementos == 0) { // lista vazia
			Celula nova = new Celula(elemento); // n�o aponta p/ elemento nenhum
			this.primeira = nova; // primeiro elemento � aquele q esta sendo adicionado agora
			this.ultima = nova;// �ltimo elemento tbm � aquele q esta sendo adicionado agora
		} else {
			Celula nova = new Celula(elemento, this.primeira);// celula nova aponta p/ a primeira celula da lista
			this.primeira.setAnterior(nova);// primeira celula aponta p/ a celula nova
			this.primeira = nova; // a primeira celula agora � a nova
		}
		this.totalDeElementos++;
	}

	public void adiciona(Object elemento) {// adiciona no fim
		if (this.totalDeElementos == 0) {
			adicionaNoComeco(elemento);// adiciona no come�o se alista estiver vazia
		} else {
			Celula nova = new Celula(elemento);// nova celula aponta p/ nenhum lugar inicialmente
			this.ultima.setProximo(nova);// a ultima passa a apontar p/ a nova
			nova.setAnterior(this.ultima); // a nova celula agora aponta p/ a �ltima c�lula original
			this.ultima = nova; // a �ltima c�lula agora pe a nova
			this.totalDeElementos++;
		}
	}

	public void adiciona(int posicao, Object elemento) {

		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) {// adiciona no fim se a posicao for igual a qtd de elemntos
			this.adiciona(elemento);
		} else {
			Celula anterior = pegaCelula(posicao - 1);// pega a celula anterior daquela q esta querendo inserir (a
														// esquerda)
			Celula proxima = anterior.getProximo(); // pega a proxima daquela q esta querendo inserir (a direita)

			Celula nova = new Celula(elemento, anterior.getProximo()); // a nova celula aponta p/ a proxima
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}

	}

	@Override
	public void removeDoFim() {
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}

	}

	public void remove(int posicao) {
		if (posicao == 0) {
			this.removeDoComeco();
		} else if (posicao == this.totalDeElementos - 1) {
			this.removeDoFim();
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();

			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);

			this.totalDeElementos--;
		}
	}

}
