package busca;

import java.util.Scanner;

public class BuscaLinear01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] itens = { "Arroz", "Feijao", "Macarrao" };

		System.out.println("Digite o item");
		String item = sc.nextLine();

		int posicaoEncontrada = buscaLinear(item, itens);

		System.out.println("Esta contido em itens: " + contem("Macarrao", itens));
		if (posicaoEncontrada >= 0) {
			System.out.println("Encontrado na posicao: " + posicaoEncontrada);
			System.out.println("Nome: " + itens[posicaoEncontrada]);
		}

		sc.close();
	}

	// IndexOf
	public static int buscaLinear(String elemento, String[] elementos) {
		for (int i = 0; i < elementos.length; ++i) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	// Contains
	public static boolean contem(String elemento, String[] elementos) {
		return buscaLinear(elemento, elementos) != -1;
	}

}
