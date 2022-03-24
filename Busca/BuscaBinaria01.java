package busca;

public class BuscaBinaria01 {
	public static void main(String[] args) {
		int[] numeros = { 1, 4, 5, 7, 9, 11, 15 };
		int numero = 15;

		int posicaoEncontrada = buscaBinaria(numero, numeros);

		System.out.println("Busca binaria com numeros:");

		System.out.println(posicaoEncontrada);

		String[] nomes = { "Daniela", "Gabriel", "Mariana", "Pedro", "Ruan" };
		String nome = "Pedro";

		int posicaoEncontradaString = buscaBinariaString(nome, nomes);

		System.out.println("Busca binaria com strings:");

		if (posicaoEncontradaString >= 0) {
			System.out.println("O nome " + nomes[posicaoEncontradaString] + " foi encontrado na posicao "
					+ posicaoEncontradaString);
		} else {
			System.out.println("Desculpe, o nome nao foi encontrado :(");
		}
	}

	public static int buscaBinaria(int elemento, int[] elementos) {
		int inicio = 0;
		int fim = elementos.length - 1;
		int meio;

		while (inicio <= fim) {
			meio = (int) (inicio + fim) / 2;

			if (elemento == elementos[meio]) {
				return meio;
			} else if (elemento > elementos[meio]) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}

		return -1;
	}

	public static int buscaBinariaString(String elemento, String[] elementos) {
		int inicio = 0;
		int fim = elementos.length - 1;
		int meio;

		while (inicio <= fim) {
			meio = (int) (inicio + fim) / 2;

			if (elemento.compareTo(elementos[meio]) == 0) {
				return meio;
			} else if (elemento.compareTo(elementos[meio]) > 0) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}

		return -1;
	}
}
