public class Aluno {
	private String prontuario;
	private String nome;

	public Aluno() {
	}

	public Aluno(String prontuario, String nome) {
		this.prontuario = prontuario;
		this.nome = nome;
	}

	public void setProntuario(String prontuario) {
		prontuario = prontuario.trim();

		if (prontuario.equals("")) {
			throw new IllegalArgumentException();
		} else if (prontuario.toUpperCase().startsWith("SP") && prontuario.length() == 8) {
			this.prontuario = prontuario;
		} else
			throw new IllegalArgumentException();

	}

	public String getProntuario() {
		return prontuario;
	}

	public void setNome(String nome) {
		nome = nome.trim();

		if (nome.equals("")) {
			throw new IllegalArgumentException();
		} else if (nome.length() >= 5 && nome.length() <= 100) {
			this.nome = nome;
		} else
			throw new IllegalArgumentException();

	}

	public String getNome() {
		return nome;
	}

}