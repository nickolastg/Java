public class Main {
	public static void main(String[] args) {
		System.out.println("Teste classe Vetor: ");

		Vetor v1 = new Vetor(4);
		v1.adicionar("a");
		v1.adicionar("b");
		v1.adicionar("c");
		v1.adicionar("d");

		System.out.println(v1.tamanho());
		System.out.println(v1.toString());

		v1.remover(2);
		System.out.println(v1.toString());

		v1.adicionar("e");
		System.out.println(v1.toString());

		v1.adicionar(2, "c");
		System.out.println(v1.toString());

		System.out.println(v1.buscar("d"));
		System.out.println(v1.buscar(3));

		System.out.println("Teste classe VetorInt: ");

		VetorInt v2 = new VetorInt(4);
		v2.adicionar(1);
		v2.adicionar(2);
		v2.adicionar(3);
		v2.adicionar(4);

		System.out.println(v2.tamanho());
		System.out.println(v2.toString());

		v2.remover(2);
		System.out.println(v2.toString());

		v2.adicionar(5);
		System.out.println(v2.toString());

		v2.adicionar(2, 3);
		System.out.println(v2.toString());

		System.out.println(v2.buscaPosicao(1));
		System.out.println(v2.buscaElemento(5));

	}
}