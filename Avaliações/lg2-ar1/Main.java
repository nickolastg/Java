class Main {
	public static void main(String[] args) {
		System.out.println("--------------------");

		int[] vetor1 = { 3, 0, 4, 0, 5, 0, 0, 6 };
		int[] resultado1 = VetorUtil.eliminaZero(vetor1);

		System.out.println("Valores de entrada, metodo 2.1");

		System.out.println("vetor1:");
		exibeVetor(vetor1);

		System.out.println("");
		System.out.println("Valores resultantes, metodo 2.1");

		System.out.println("resultado1:");
		exibeVetor(resultado1);
		System.out.println("");

		System.out.println("--------------------");

		int[] vetor2 = { 9, 7, 2, 9, 3, 9, 4, 9 };
		int numeroBusca = 9;
		int[] resultado2 = VetorUtil.encontraNumeroPosicoes(vetor2, numeroBusca);

		System.out.println("Valores de entrada, metodo 2.2");

		System.out.println("vetor2:");
		exibeVetor(vetor2);
		System.out.println("numeroBusca: " + numeroBusca);

		System.out.println("");
		System.out.println("Valores resultantes, metodo 2.2");

		System.out.println("resultado2:");
		exibeVetor(resultado2);
		System.out.println("");

		System.out.println("--------------------");

		int[] vetor3A = { 2, 7, 4, 7, 7, 5 };
		int[] vetor3B = { 4, 9, 7 };
		int[] resultado3 = VetorUtil.interseccaoVetores(vetor3A, vetor3B);

		System.out.println("Valores de entrada, metodo 2.3");

		System.out.println("vetor3A: ");
		exibeVetor(vetor3A);
		System.out.println("vetor3B: ");
		exibeVetor(vetor3B);

		System.out.println("");
		System.out.println("Valores resultantes, metodo 2.3");

		System.out.println("resultado3:");
		exibeVetor(resultado3);
		System.out.println("");

		System.out.println("--------------------");

	}

	public static void exibeVetor(int[] resultado) {
		for (int i = 0; i < resultado.length; ++i) {
			System.out.println(resultado[i]);
		}
	}

}