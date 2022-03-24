import java.util.Arrays;

public class VetorInt implements VetorIntInterface {

	private int[] elementos;
	private int tamanho;

	public VetorInt(int capacidade) {
		this.elementos = new int[capacidade];
		this.tamanho = 0;
	}

	@Override
	public void adicionar(int elemento) {
		this.aumentarCapacidade();
		this.elementos[this.tamanho] = elemento;
		++tamanho;
	}

	@Override
	public void adicionar(int posicao, int elemento) {
		this.aumentarCapacidade();
		this.verificaPosicao(posicao);

		for (int i = this.tamanho - 1; i >= posicao; --i) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

	}

	@Override
	public void remover(int posicao) {
		this.verificaPosicao(posicao);

		for (int i = posicao; i < tamanho - 1; ++i) {
			this.elementos[i] = this.elementos[i + 1];
		}

		this.tamanho--;
		this.elementos[tamanho] = 0;

	}

	@Override
	public int buscaPosicao(int posicao) {
		this.verificaPosicao(posicao);
		return this.elementos[posicao];
	}

	@Override
	public int buscaElemento(int elemento) {
		for (int i = 0; i < this.tamanho; ++i) {
			if (this.elementos[i] == elemento) {
				return i;
			}
		}
		return -1;

	}

	public void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			int[] elementosNovos = new int[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; ++i) {
				elementosNovos[i] = elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public void verificaPosicao(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new RuntimeException("Argumento invalido");
		}

	}

	public String toString() {
		return Arrays.toString(this.elementos);
	}

	@Override
	public int tamanho() {
		return this.tamanho;
	}

}