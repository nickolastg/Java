import java.util.List;
import java.util.ArrayList;

public class Correntista {
	private int codigo;
	private String nome;
	private List<Conta> contas;

	public Correntista(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public double totalTarifa() {
		double soma = 0;

		for (Conta conta : contas) {
			soma += conta.calcularTarifa();
		}
//		for (int i = 0; i < contas.size(); ++i) {
//			soma += contas.get(i).calcularTarifa();
//		}
		return soma;

	}

	public void addConta(Conta conta) {
		contas.add(conta);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

}