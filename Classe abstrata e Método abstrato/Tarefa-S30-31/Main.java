import java.time.LocalDate;

class Main {
	public static void main(String[] args) {
		Correntista cor1 = new Correntista(123, "Pedro");

		Empresa em1 = new Empresa("01. 101. 111/0001-01", "Empresa1");

		ContaCorrente cc1 = new ContaCorrente(999, LocalDate.of(2001, 8, 11), 2000.00, 20, cor1, 200.00);

		ContaPoupanca cp1 = new ContaPoupanca(999, LocalDate.of(2001, 8, 11), 2000.00, 20, cor1,
				LocalDate.of(2021, 8, 11));

		ContaSalario cs1 = new ContaSalario(999, LocalDate.of(2001, 8, 11), 2000.00, 0, cor1, em1);

		System.out.println(cor1.totalTarifa());

	}

}