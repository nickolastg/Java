import java.time.LocalDate;

class Main {
	public static void main(String[] args) {
		Correntista cor1 = new Correntista(123, "Pedro");

		Conta c1 = new Conta(999, LocalDate.of(2001, 8, 11), 5000.00, 0, cor1);

		ContaCorrente cc1 = new ContaCorrente(999, LocalDate.of(2001, 8, 11), 2000.00, 0, cor1, 200.00);

		ContaPoupanca cp1 = new ContaPoupanca(999, LocalDate.of(2001, 8, 11), 2000.00, 0, cor1,
				LocalDate.of(2021, 8, 11));

		Empresa e1 = new Empresa("01. 101. 111/0001-01", "Empresa1");

		ContaSalario cs1 = new ContaSalario(999, LocalDate.of(2001, 8, 11), 2000.00, 0, cor1, e1);

		cor1.addConta(c1);
		cor1.addConta(cc1);
		cor1.addConta(cp1);
		cor1.addConta(cs1);

		System.out.println(cor1.getContas());

		System.out.println(cor1.totalTarifa());

		System.out.println(c1.saldo);
		c1.sacar(4000.0);
		System.out.println(c1.saldo);
		c1.depositar(4000.0);
		System.out.println(c1.saldo);

		System.out.println(cc1.saldo);
		cc1.sacar(2200.0);
		System.out.println(cc1.saldo);
		cc1.depositar(2200.0);
		System.out.println(cc1.saldo);

		System.out.println(cp1.getAniversario());

		System.out.println(cs1.getEmpresa());

	}
}