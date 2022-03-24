public class Retangulo {
	private int base;
	private int altura;

	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int calcularArea() {
		return base * altura;
	}

	public int calcularPerimetro() {
		return 2 * (base + altura);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		if (base <= 0) {
			throw new IllegalArgumentException("");
		} else
			this.base = base;

	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("");
		} else
			this.altura = altura;

	}

}