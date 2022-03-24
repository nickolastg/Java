import java.util.Arrays;

public class Vetor implements VetorInterface {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	@Override
	public void adicionar(String elemento) {
		this.aumentarCapacidade();
		this.elementos[this.tamanho] = elemento;
		++tamanho;
	}

	@Override
	public void adicionar(int posicao, String elemento) {
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
		this.elementos[tamanho] = null;

	}

	@Override
	public String buscar(int posicao) {
		this.verificaPosicao(posicao);
		return this.elementos[posicao];
	}

	@Override
	public int buscar(String elemento) {
		for (int i = 0; i < this.tamanho; ++i) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;

	}

	public void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
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