import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de notas a serem inseridas");
		int numeroNotas = sc.nextInt();

		float[] notas = new float[numeroNotas];
		for (int i = 0; i < numeroNotas; ++i) {
			System.out.println("Entre com a nota " + (i + 1));
			notas[i] = sc.nextFloat();
		}
		float soma = 0;
		for (int i = 0; i < notas.length; ++i) {
			soma = soma + notas[i];
		}

		float media = soma / numeroNotas;
		System.out.println("A Media eh: " + media);
		sc.close();
	}

}