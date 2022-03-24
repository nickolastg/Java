public class ListaDuplamenteEncadeada<T> implements ListaDuplamenteEncadeadaInterface<T> {
	private No<T> head;
	private No<T> tail;
	private int tamanho;

	public ListaDuplamenteEncadeada() {
		head = new No<>(null, null, null);
		tail = new No<>(head, null, null);
		head.setProximo(tail);
		tamanho = 0;
	}

	private void adicionarEntre(T elemento, No<T> anterior, No<T> proximo) {
		No<T> no = new No<>(anterior, elemento, proximo);

		anterior.setProximo(no);
		proximo.setAnterior(no);

		++tamanho;
	}

	@Override
	public void adicionarInicio(T elemento) {
		adicionarEntre(elemento, head, head.getProximo());
	}

	@Override
	public void adicionarFim(T elemento) {
		adicionarEntre(elemento, tail.getAnterior(), tail);
	}

	private void remover(No<T> no) {
		No<T> anterior = no.getAnterior();
		No<T> proximo = no.getProximo();

		anterior.setProximo(proximo);
		proximo.setAnterior(anterior);

		--tamanho;
	}

	@Override
	public void removerInicio() {
		if (vazia())
			throw new RuntimeException("Lista Vazia");
		remover(head.getProximo());
	}

	@Override
	public void removerFim() {
		if (vazia())
			throw new RuntimeException("Lista Vazia");
		remover(tail.getAnterior());
	}

	@Override
	public T primeiro() {
		if (vazia())
			throw new RuntimeException("Lista Vazia");
		return head.getProximo().getElemento();
	}

	@Override
	public T ultimo() {
		if (vazia())
			throw new RuntimeException("Lista Vazia");
		return tail.getAnterior().getElemento();
	}

	@Override
	public T buscar(int posicao) {
		if (vazia())
			throw new RuntimeException("Lista vazia");
		if (!(posicao < tamanho && posicao >= 0))
			throw new RuntimeException("Posicao invalida");

		No<T> ant = head.getProximo();

		for (int i = 0; i < posicao; i++) {
			ant = ant.getProximo();
		}

		return ant.getElemento();
	}

	@Override
	public void adicionar(int posicao, T elemento) {
		if (!(posicao < tamanho && posicao >= 0))
			throw new RuntimeException("Posicao invalida");

		No<T> ant = head.getProximo();

		for (int i = 0; i < posicao - 1; i++) {
			ant = ant.getProximo();
		}

		adicionarEntre(elemento, ant, ant.getProximo());
	}

	@Override
	public int tamanho() {
		return tamanho;
	}

	@Override
	public boolean vazia() {
		return tamanho == 0;
	}

}