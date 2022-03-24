import java.util.List;
import java.util.ArrayList;

public class Curso {
	private String nome;
	private String sigla;
	private List<Projeto> projetos;

	public Curso(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
		this.projetos = new ArrayList<>();
	}

	public void adicionarProjeto(Projeto projeto) {
		projetos.add(projeto);
	}

	public int getNumeroProjetos() {
		return projetos.size();
	}

	public List<Projeto> getProjetosAtivos() {
		List<Projeto> aux = new ArrayList<>();

		for (Projeto projeto : projetos) {
			if (projeto.getAtivo()) {
				aux.add(projeto);
			}
		}
		return aux;

	}

	public int getNumeroProjetosAtivos() {
		return this.getProjetosAtivos().size();
	}

}