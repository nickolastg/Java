// javac Main.java
// java Main "Joao da Silva" 10.0 9.5 9.5 7.5
// java Main "Maria dos Santos" 7.0 6.5 10.0

class Main {
	public static void main(String[] args) {
		String nome = args[0];

		double[] notas = new double[args.length - 1];

		if (notas.length >= 2) {
			for (int i = 0; i < notas.length; ++i) {
				notas[i] = Double.parseDouble(args[i + 1]);
			}
			double media = Estatistica.calcularMedia(notas);
			exibirNota(media, nome);

			double maior = Estatistica.calculoMaior(notas);
			exibirMaior(maior);

			double menor = Estatistica.calculoMenor(notas);
			exibirMenor(menor);

		} else {
			System.out.println("Voce digitou menos de duas notas.");
		}
	}

	// "João da Silva tem média 9.5"
	public static void exibirNota(double nota, String nome) {
		System.out.println("" + nome + " tem media: " + String.format("%.2f", nota));
	}

	public static void exibirMaior(double maiorNota) {
		System.out.println("A maior nota do aluno eh: " + String.format("%.2f", maiorNota));
	}

	public static void exibirMenor(double menorNota) {
		System.out.println("A menor nota do aluno eh: " + String.format("%.2f", menorNota));
	}

}