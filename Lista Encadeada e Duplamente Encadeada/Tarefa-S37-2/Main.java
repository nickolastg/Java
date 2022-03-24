public class Main {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();

		lista.adicionarInicio(1);
		lista.adicionarFim(2);
		lista.adicionarFim(3);
		System.out.println("Busca posicao 0: " + lista.buscar(0));
		System.out.println("Busca posicao 1: " + lista.buscar(1));
		System.out.println("Busca posicao 2: " + lista.buscar(2));

		lista.adicionar(1, 100);
		lista.removerFim();
		System.out.println("\nBusca posicao 0: " + lista.buscar(0));
		System.out.println("Busca posicao 1: " + lista.buscar(1));
		System.out.println("Busca posicao 2: " + lista.buscar(2));
		System.out.println("Busca posicao 3: " + lista.buscar(3));
		// Deve lançar a exceção para posição inválida na busca pelo index 3
	}

}