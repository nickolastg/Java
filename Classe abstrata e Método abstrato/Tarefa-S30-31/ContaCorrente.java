import java.time.LocalDate;

public class ContaCorrente extends Conta {
	private double limite;

	public ContaCorrente(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista,
			double limite) {
		super(numero, dataAbertura, saldo, tarifa, correntista);
		this.limite = limite;
	}

	@Override
	public double calcularTarifa() {
		return this.tarifa * 1.5;
	}

	@Override
	public void sacar(double valor) {
		if (saldo + limite < valor) {
			throw new IllegalArgumentException("Valor de saque maior que saldo e limite disponivel.");
		} else {
			saldo -= valor;
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}