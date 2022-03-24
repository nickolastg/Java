class Main {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Joao");
		Funcionario f2 = new Funcionario("Maria");
		Funcionario f3 = new Funcionario("Pedro");
		Funcionario f4 = new Funcionario("Paulo");
		Funcionario f5 = new Funcionario("Rodrigo");
		Funcionario f6 = new Funcionario("Julia");
		// Funcionario f7 = new Funcionario("Cristiano");

		f1.addSubordinados(f2);
		f1.addSubordinados(f3);
		f1.addSubordinados(f4);
		f1.addSubordinados(f5);
		f1.addSubordinados(f6);

		for (Funcionario f : f1.getSubordinados()) {
			System.out.println(f.getNome());
		}

		// f1.addSubordinados(f7);

		System.out.println(f1.getQuantidadeSubordinados());
	}

}