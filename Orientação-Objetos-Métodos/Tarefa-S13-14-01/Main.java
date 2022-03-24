class Main {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.codigo = 1;
		c1.saldo = 0.0;
		c1.limite = 20.0;

		Conta c2 = new Conta();
		c2.codigo = 2;
		c2.saldo = 100.00;
		c2.limite = 500.00;

		if (c1.depositar(120.00)) {
			System.out.println("sucesso");
			c1.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

		if (c2.depositar(50.50)) {
			System.out.println("sucesso");
			c2.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

		if (c1.sacar(110.00)) {
			System.out.println("sucesso");
			c1.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

		if (c2.sacar(200.00)) {
			System.out.println("sucesso");
			c2.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

		if (c1.transferir(c2, 10.00)) {
			System.out.println("sucesso");
			c1.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");

		if (c1.transferir(c2, 30.00)) {
			System.out.println("sucesso");
			c1.consultarSaldo();
		} else
			System.out.println("nao pode ser concluido");
	}

}