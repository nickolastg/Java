class VetorUtil {
	public static int[] eliminaZero(int[] vetor) {
		int tamanho = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != 0) {
				tamanho++;
			}
		}

		int[] resultado = new int[tamanho];
		int j = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != 0) {
				resultado[j] = vetor[i];
				++j;
			}
		}

		return resultado;
	}

	public static int[] encontraNumeroPosicoes(int[] vetor, int numero) {
		int tamanho = 0;

		for (int i = 0; i < vetor.length; ++i) {
			if (vetor[i] == numero) {
				tamanho++;
			}
		}

		int[] resultado = new int[tamanho];
		int j = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				resultado[j] = i;
				++j;
			}
		}

		return resultado;
	}

	public static int[] interseccaoVetores(int[] vetor1, int[] vetor2) {
		int[] aux = new int[vetor1.length + vetor2.length];
		int tamanho = 0;

		for (int i = 0; i < vetor1.length; ++i) {
			for (int j = 0; j < vetor2.length; ++j) {

				if (vetor1[i] == vetor2[j]) {
					boolean verificaRepetido = false;

					for (int k = 0; k < aux.length; ++k) {
						if (vetor1[i] == aux[k]) {
							verificaRepetido = true;
						}
					}

					if (verificaRepetido == false) {
						aux[tamanho] = vetor1[i];
						tamanho++;
					}

				}

			}
		}

		int[] resultado = new int[tamanho];

		for (int i = 0; i < resultado.length; ++i) {
			resultado[i] = aux[i];
		}

		return resultado;
	}

}