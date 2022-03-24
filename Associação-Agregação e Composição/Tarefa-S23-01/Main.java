class Main {
	public static void main(String[] args) {
		Ator a1 = new Ator("Matthew McConaughey");
		Ator a2 = new Ator("Anne Hathaway");
		Ator a3 = new Ator("Mackenzie Foy");
		Ator a4 = new Ator("Pessoa1");
		Ator a5 = new Ator("Pessoa2");

		Filme f1 = new Filme("Interestelar", 2014);
		Filme f2 = new Filme("filmasso", 2050);

		Papel p1 = new Papel("Cooper", a1, f1);
		Papel p2 = new Papel("Amelia Brand", a2, f1);
		Papel p3 = new Papel("Murphy Cooper", a3, f1);
		Papel p4 = new Papel("Personagem1", a4, f2);
		Papel p5 = new Papel("Personagem2", a5, f2);

		a1.addPapel(p1);
		a2.addPapel(p2);
		a3.addPapel(p3);
		a4.addPapel(p4);
		a5.addPapel(p5);

		f1.addPapel(p1);
		f1.addPapel(p2);
		f1.addPapel(p3);
		f2.addPapel(p4);
		f2.addPapel(p5);

	}

}