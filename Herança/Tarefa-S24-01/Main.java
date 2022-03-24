class Main {
	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("Paulo", 5000.0, 20);

		System.out.println(v1.obterSalario());

		VendedorFixo vf1 = new VendedorFixo("Pedro", 5000.0, 30, 900);

		System.out.println(vf1.obterSalario());

	}

}