package ed;

import java.util.Arrays;

//Armazenamento Sequencial: conjunto de espa�os (Array)

public class Vetor {
	private Aluno[] alunos = new Aluno[100]; // array de alunos com 100 espa�os
	private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {

		garanteEspaco();

		// Solu��o menos perfomatica: quanto maior o n�mero de alunos inseridos no
		// array, mais demorado ser� o m�todo
		/*
		 * for(int i = 0; i < alunos.length; i++) { if(alunos[i] == null) { alunos[i] =
		 * aluno; break; } }
		 */

		// solu��o + perfom�tica
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;

	}

	public void adiciona(int posicao, Aluno aluno) {

		garanteEspaco();

		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posi�ao invalida");
		}

		for (int i = totalDeAlunos - 1; i >= posicao; i -= 1) {
			alunos[i + 1] = alunos[i];
		}

		alunos[posicao] = aluno;
	}

	public Aluno pega(int posicao) {
		// recebe uma posi��o e devolve o aluno
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posi�ao invalida");
		}

		return this.alunos[posicao];
	}

	public void remove(int posicao) {

		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posi�ao invalida");
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
		// facilitar� na impress�o
		return Arrays.toString(alunos);
	}

	// metodo auxiliar: para tratar a exception ArrayIndexOutOfBounds
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}

	// Em Java n�o consrguimos mudar o tamanho de um array, ent�o teremos que criar
	// um novo maior e copiar tudo que est� no antigo para este.
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
