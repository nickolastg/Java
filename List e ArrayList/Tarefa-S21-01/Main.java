class Main {
	public static void main(String[] args) {
		Carga c1 = new Carga(11, 500.00);
		Carga c2 = new Carga(22, 250.00);
		Carga c3 = new Carga(33, 250.00);

		Aviao a1 = new Aviao(1, 1000.00);
		a1.adicionarCarga(c1);
		System.out.println("c1 -> Peso atual: " + a1.getTotalPeso());
		System.out.println("Disponivel: " + a1.getTotalDisponivel());
		a1.adicionarCarga(c2);
		System.out.println("c2 -> Peso atual: " + a1.getTotalPeso());
		System.out.println("Disponivel: " + a1.getTotalDisponivel());
		a1.adicionarCarga(c3);
		System.out.println("c3 -> Peso atual: " + a1.getTotalPeso());
		System.out.println("Disponivel: " + a1.getTotalDisponivel());

	}
}