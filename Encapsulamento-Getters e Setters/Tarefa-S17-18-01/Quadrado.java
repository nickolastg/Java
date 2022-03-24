public class Quadrado {
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	public int calcularArea() {
		return lado * lado;
	}

	public int calcularPerimetro() {
		return 4 * lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		if (lado <= 0) {
			throw new IllegalArgumentException("");
		} else
			this.lado = lado;

	}

}