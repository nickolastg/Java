import java.util.List;
import java.util.ArrayList;

public class Aviao {
	private int numero;
	private double limitePeso;
	private List<Carga> cargas;

	public Aviao(Integer numero, double limitePeso) {
		this.cargas = new ArrayList<>();
		this.numero = numero;
		this.limitePeso = limitePeso;
	}

	public void adicionarCarga(Carga carga) {
		if (getTotalDisponivel() >= carga.getPeso()) {
			cargas.add(carga);
		} else
			throw new IllegalArgumentException("Peso de carga nao suportado");
	}

	public Integer getNumero() {
		return numero;
	}

	public Double getLimitePeso() {
		return limitePeso;
	}

	public Double getTotalPeso() {
		double somaPesos = 0;
		for (Carga c : cargas) {
			somaPesos = somaPesos + c.getPeso();
		}

		return somaPesos;
	}

	public Double getTotalDisponivel() {
		return limitePeso - getTotalPeso();
	}

}