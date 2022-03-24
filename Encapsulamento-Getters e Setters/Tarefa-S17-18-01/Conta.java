public class Conta {
	private int codigo;
	private double saldo;
	private double limite;

	public Conta(int codigo, double saldo, double limite) {
		this.codigo = codigo;
		this.saldo = saldo;
		this.limite = limite;
	}

	public void consultarSaldo() {
		System.out.println("Saldo: " + saldo);
	}

	public boolean depositar(double valor) {
		saldo = saldo + valor;
		return true;
	}

	public boolean sacar(double valor) {
		if (saldo + limite >= valor) {
			saldo = saldo - valor;
			return true;
		} else
			return false;
	}

	public boolean transferir(Conta conta, double valor) {
		if (saldo + limite >= valor) {
			saldo = saldo - valor;
			conta.saldo = conta.saldo + valor;
			return true;
		} else
			return false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}