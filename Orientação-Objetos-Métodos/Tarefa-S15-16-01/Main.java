public class Main {
	public static void main(String[] args) {
		// Cria um objeto (instância) da classe Quadrado
		Quadrado q1 = new Quadrado(5);

		System.out.println(q1.lado);
		System.out.println(q1.calcularArea());
		System.out.println(q1.calcularPerimetro());

		System.out.println("-----------");

		Quadrado q2 = new Quadrado(10);

		System.out.println(q2.lado);
		System.out.println(q2.calcularArea());
		System.out.println(q2.calcularPerimetro());

		System.out.println("--------X--------");

		Retangulo r1 = new Retangulo(4, 5);

		System.out.println(r1.base);
		System.out.println(r1.altura);
		System.out.println(r1.calcularArea());
		System.out.println(r1.calcularPerimetro());

		System.out.println("-----------");

		Retangulo r2 = new Retangulo(5, 6);

		System.out.println(r2.base);
		System.out.println(r2.altura);
		System.out.println(r2.calcularArea());
		System.out.println(r2.calcularPerimetro());

		System.out.println("-----------");

		Retangulo r3 = new Retangulo(6, 7);

		System.out.println(r3.base);
		System.out.println(r3.altura);
		System.out.println(r3.calcularArea());
		System.out.println(r3.calcularPerimetro());

		System.out.println("--------X--------");

		Circulo c1 = new Circulo(10);

		System.out.println(c1.raio);
		System.out.println(c1.calcularArea());
		System.out.println(c1.calcularPerimetro());

		System.out.println("-----------");

		Circulo c2 = new Circulo(15);

		System.out.println(c2.raio);
		System.out.println(c2.calcularArea());
		System.out.println(c2.calcularPerimetro());

		System.out.println("-----------");

		Circulo c3 = new Circulo(20);

		System.out.println(c3.raio);
		System.out.println(c3.calcularArea());
		System.out.println(c3.calcularPerimetro());

		System.out.println("-----------");

		Conta co1 = new Conta(1, 0.0, 20.0);
		Conta co2 = new Conta(2, 100.00, 500.00);

		if (co1.depositar(120.00)) {
			System.out.println("sucesso");
			co1.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

		if (co2.depositar(50.50)) {
			System.out.println("sucesso");
			co2.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

		if (co1.sacar(110.00)) {
			System.out.println("sucesso");
			co1.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

		if (co2.sacar(200.00)) {
			System.out.println("sucesso");
			co2.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

		if (co1.transferir(co2, 10.00)) {
			System.out.println("sucesso");
			co1.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

		if (co1.transferir(co2, 30.00)) {
			System.out.println("sucesso");
			co1.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

	}

}