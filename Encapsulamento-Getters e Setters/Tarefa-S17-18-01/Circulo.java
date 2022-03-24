public class Circulo {
	private int raio;

	public Circulo(int raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return Math.PI * raio * raio;
	}

	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		if (raio <= 0) {
			throw new IllegalArgumentException("");
		} else
			this.raio = raio;

	}

}