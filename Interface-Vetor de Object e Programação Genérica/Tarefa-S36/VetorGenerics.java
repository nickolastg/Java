import java.util.Arrays;

public class VetorGenerics<T> implements VetorInterfaceGenerics<T> {
	private T[] elementos;
	private int tamanho;

	public VetorGenerics(int capacidade) {
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	private void aumentarCapacidade() {
		if (tamanho == elementos.length) {
			T[] elementosNovos = (T[]) new Object[elementos.length * 2];
			for (int i = 0; i < tamanho; ++i) {
				elementosNovos[i] = elementos[i];
			}
			elementos = elementosNovos;
		}
	}

	@Override
	public void adicionar(T elemento) {
		aumentarCapacidade();
		elementos[tamanho] = elemento;
		++tamanho;
	}

	@Override
	public void adicionar(int posicao, T elemento) {
		if (posicao < 0 || posicao >= tamanho) {
			throw new RuntimeException("Argumento invalido");
		}

		aumentarCapacidade();

		for (int i = tamanho - 1; i >= posicao; --i) {
			elementos[i + 1] = elementos[i];
		}

		elementos[posicao] = elemento;
		++tamanho;
	}

	@Override
	public void remover(int posicao) {
		if (posicao < 0 || posicao >= tamanho) {
			throw new RuntimeException("Argumento invalido");
		}

		for (int i = posicao; i < tamanho - 1; ++i) {
			elementos[i] = elementos[i + 1];
		}

		--tamanho;
		elementos[tamanho] = null;
	}

	@Override
	public T buscar(int posicao) {
		if (posicao < 0 || posicao >= tamanho) {
			throw new RuntimeException("Argumento invalido");
		}

		return elementos[posicao];
	}

	@Override
	public int buscar(T elemento) {
		for (int i = 0; i < tamanho; ++i) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;
	}

	@Override
	public int tamanho() {
		return tamanho;
	}

	public String toString() {
		return Arrays.toString(elementos);
	}

	public boolean contem(T elemento) {
		for (int i = 0; i < tamanho; ++i) {
			if (elemento == elementos[i]) {
				return true;
			}
		}

		return false;
	}

}