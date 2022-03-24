import java.util.List;
import java.util.ArrayList;

public class Projeto {
	private String titulo;
	private boolean ativo;
	private Curso curso;
	private List<Pessoa> participantes;

	public Projeto(String titulo, boolean ativo, Curso curso) {
		this.titulo = titulo;
		this.ativo = ativo;
		curso.adicionarProjeto(this);
		this.participantes = new ArrayList<>();
	}

	public void adicionarParticipante(Pessoa pessoa) {
		if (this.ativo != true) {
			throw new IllegalArgumentException("Não é possível adicionar participante em um projeto não ativo");
		} else {
			participantes.add(pessoa);
		}

	}

	public int getNumeroParticipantes() {
		return participantes.size();
	}

	public String getTitulo() {
		return titulo;
	}

	public boolean getAtivo() {
		return ativo;
	}

}