public class Main {
	public static void main(String[] args) {
		System.out.println("Pilha: ");

		Pilha<Integer> p = new Pilha<>(3);

		p.empilha(1);
		p.empilha(2);
		p.empilha(3);
		p.empilha(4);

		System.out.println(p.tamanho()); // 4

		System.out.println(p.desempilha()); // 4

		System.out.println(p.topo()); // 3

		System.out.println(p.tamanho()); // 3

		System.out.println(p.vazia()); // false

		for (int i = p.tamanho(); i > 0; --i) {
			p.desempilha();
		}

		System.out.println(p.vazia()); // true

		System.out.println("------------\nFila: ");

		Fila<Integer> f = new Fila<>(2);

		f.enfileirar(1);
		f.enfileirar(2);
		f.enfileirar(3);
		f.enfileirar(4);

		System.out.println(f.tamanho()); // 4

		System.out.println(f.desenfileirar()); // 1

		System.out.println(f.primeiro()); // 2

		System.out.println(f.tamanho()); // 3

		System.out.println(f.vazia()); // false

		for (int i = f.tamanho(); i > 0; --i) {
			f.desenfileirar();
		}

		System.out.println(f.vazia()); // true

	}

}