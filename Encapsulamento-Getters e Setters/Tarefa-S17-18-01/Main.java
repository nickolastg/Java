public class Main {
	public static void main(String[] args) {
		// Cria um objeto (instância) da classe Quadrado
		Quadrado q1 = new Quadrado(5);
		q1.setLado(4);

		System.out.println(q1.getLado());
		System.out.println(q1.calcularArea());
		System.out.println(q1.calcularPerimetro());

		System.out.println("-----------");

		Quadrado q2 = new Quadrado(10);
		q2.setLado(11);

		System.out.println(q2.getLado());
		System.out.println(q2.calcularArea());
		System.out.println(q2.calcularPerimetro());

		System.out.println("--------X--------");

		Retangulo r1 = new Retangulo(4, 5);
		r1.setBase(5);
		r1.setAltura(6);

		System.out.println(r1.getBase());
		System.out.println(r1.getAltura());
		System.out.println(r1.calcularArea());
		System.out.println(r1.calcularPerimetro());

		System.out.println("-----------");

		Retangulo r2 = new Retangulo(5, 6);
		r2.setBase(6);
		r2.setAltura(7);

		System.out.println(r2.getBase());
		System.out.println(r2.getAltura());
		System.out.println(r2.calcularArea());
		System.out.println(r2.calcularPerimetro());

		System.out.println("-----------");

		Retangulo r3 = new Retangulo(6, 7);
		r3.setBase(7);
		r3.setAltura(8);

		System.out.println(r3.getBase());
		System.out.println(r3.getAltura());
		System.out.println(r3.calcularArea());
		System.out.println(r3.calcularPerimetro());

		System.out.println("--------X--------");

		Circulo c1 = new Circulo(10);
		c1.setRaio(15);

		System.out.println(c1.getRaio());
		System.out.println(c1.calcularArea());
		System.out.println(c1.calcularPerimetro());

		System.out.println("-----------");

		Circulo c2 = new Circulo(15);
		c2.setRaio(20);

		System.out.println(c2.getRaio());
		System.out.println(c2.calcularArea());
		System.out.println(c2.calcularPerimetro());

		System.out.println("-----------");

		Circulo c3 = new Circulo(20);
		c3.setRaio(25);

		System.out.println(c3.getRaio());
		System.out.println(c3.calcularArea());
		System.out.println(c3.calcularPerimetro());

		System.out.println("-----------");

		Conta co1 = new Conta(1, 0.0, 20.0);
		co1.setCodigo(2);
		co1.setSaldo(300.00);
		co1.setLimite(20.0);

		if (co1.depositar(120.00)) {
			System.out.println("sucesso");
			System.out.println(co1.getSaldo());
		} else
			System.out.println("nao pode ser concluido");

		if (co1.sacar(110.00)) {
			System.out.println("sucesso");
			System.out.println(co1.getSaldo());
		} else
			System.out.println("nao pode ser concluido");

	}

}