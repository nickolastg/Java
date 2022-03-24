class Main {
	public static void main(String[] args) {
		int[] numeros = { 5, 10, 20 };

		System.out.println(somaRecursiva(numeros, numeros.length));
		System.out.println(somaIterativa(numeros));
	}

	public static int somaRecursiva(int[] numeros, int indice) {

		if (indice == 1) {
			return numeros[indice - 1];
		}

		return somaRecursiva(numeros, indice - 1) + numeros[indice - 1];
	}

	public static int somaIterativa(int[] numeros) {
		int soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}

		return soma;
	}

}