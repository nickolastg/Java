public class Main {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();

		lista.adicionarInicio(1);
		lista.adicionarFim(2);
		lista.adicionarFim(3);
		System.out.println("Busca posicao 0: " + lista.buscar(0));
		System.out.println("Busca posicao 1: " + lista.buscar(1));
		System.out.println("Busca posicao 2: " + lista.buscar(2));

		lista.adicionar(1, 100);
		System.out.println("\nBusca posicao 0: " + lista.buscar(0));
		System.out.println("Busca posicao 1: " + lista.buscar(1));
		System.out.println("Busca posicao 2: " + lista.buscar(2));
		System.out.println("Busca posicao 3: " + lista.buscar(3));
	}

}