package ed.listaligada;

public class Celula {

	private Object elemento; // lista ligada apenas
	private Celula proximo; // lista ligada apenas
	private Celula anterior; // necessário para lista duplamente ligada

	public Celula(Object elemento) {
		this(elemento, null);
	}

	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Object getElemento() {
		return elemento;
	}

	@Override
	public String toString() {
		return (String) elemento;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
}