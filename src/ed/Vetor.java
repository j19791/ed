package ed;

import java.util.Arrays;

//Armazenamento Sequencial: conjunto de espaços (Array)

public class Vetor {
	private Aluno[] alunos = new Aluno[100]; // array de alunos com 100 espaços
	private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {

		garanteEspaco();

		// Solução menos perfomatica: quanto maior o número de alunos inseridos no
		// array, mais demorado será o método
		/*
		 * for(int i = 0; i < alunos.length; i++) { if(alunos[i] == null) { alunos[i] =
		 * aluno; break; } }
		 */

		// solução + perfomática
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;

	}

	public void adiciona(int posicao, Aluno aluno) {

		garanteEspaco();

		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posiçao invalida");
		}

		for (int i = totalDeAlunos - 1; i >= posicao; i -= 1) {
			alunos[i + 1] = alunos[i];
		}

		alunos[posicao] = aluno;
	}

	public Aluno pega(int posicao) {
		// recebe uma posição e devolve o aluno
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posiçao invalida");
		}

		return this.alunos[posicao];
	}

	public void remove(int posicao) {

		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posiçao invalida");
		}

		for (int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}

		totalDeAlunos--;

	}

	public boolean contem(Aluno aluno) {

		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (alunos[i].equals(aluno)) {
				return true;
			}
		}

		return false;
	}

	public int tamanho() {
		// devolve a quantidade de alunos
		return totalDeAlunos;
	}

	public String toString() {
		// facilitará na impressão
		return Arrays.toString(alunos);
	}

	// metodo auxiliar: para tratar a exception ArrayIndexOutOfBounds
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}

	// Em Java não consrguimos mudar o tamanho de um array, então teremos que criar
	// um novo maior e copiar tudo que está no antigo para este.
	private void garanteEspaco() {
		if (totalDeAlunos == alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}

	}

}
