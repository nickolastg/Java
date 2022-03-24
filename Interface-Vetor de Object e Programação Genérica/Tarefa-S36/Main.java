public class Main {
	public static void main(String[] args) {
		VetorObject vetor1 = new VetorObject(2);

		System.out.println(vetor1);
		vetor1.adicionar("a");
		vetor1.adicionar("b");
		System.out.println(vetor1);
		vetor1.adicionar("c");
		System.out.println(vetor1);

		String letra1 = (String) vetor1.buscar(0);
		System.out.println(letra1);

		System.out.println("------------------");

		VetorGenerics<String> vetor2 = new VetorGenerics<>(2);

		System.out.println(vetor2);

		vetor2.adicionar("a");
		vetor2.adicionar("b");

		System.out.println(vetor2);

		vetor2.adicionar("c");

		System.out.println(vetor2);

		String letra2 = (String) vetor2.buscar(0);

		System.out.println(letra2);

		if (vetor2.contem("b")) {
			System.out.println("vetor1 contem elemento buscado");
		} else
			System.out.println("vetor1 nao contem elementos buscado");

		if (vetor2.contem("d")) {
			System.out.println("vetor1 contem elemento buscado");
		} else
			System.out.println("vetor1 nao contem elemento buscado");

	}

}