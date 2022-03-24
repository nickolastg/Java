import java.util.List;
import java.util.ArrayList;

public class Funcionario {
	private String nome;
	private List<Funcionario> subordinados;

	public Funcionario(String nome) {
		this.nome = nome;
		this.subordinados = new ArrayList<>();
	}

	public List<Funcionario> getSubordinados() {
		return subordinados;
	}

	public int getQuantidadeSubordinados() {
		return subordinados.size();
	}

	public void addSubordinados(Funcionario funcionario) {
		if (subordinados.size() < 5) {
			this.subordinados.add(funcionario);
		} else
			throw new IllegalArgumentException("numero de subordinados" + " por funcionario ultrapassado");
	}

	public String getNome() {
		return nome;
	}

}