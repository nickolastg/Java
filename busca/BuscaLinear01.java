package busca;

import java.util.Scanner;
public class BuscaLinear01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] itens = {"Arroz", "Feij�o", "Macarr�o"};
		
		System.out.println("Digite o item");
		String item = sc.nextLine();
		
		int posicaoEncontrada = buscaLinear(item, itens);
		
		System.out.println("Est� contido em itens: " + contem("Macarr�o", itens));
		if (posicaoEncontrada >= 0) {
		System.out.println("Encontrado na posi��o: "+ posicaoEncontrada);
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