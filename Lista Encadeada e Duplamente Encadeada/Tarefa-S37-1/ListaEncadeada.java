public class ListaEncadeada<T> implements ListaEncadeadaInterface<T> {
	private No<T> head;
	private No<T> tail;
	private int tamanho;

	public ListaEncadeada() {
		head = null;
		tail = null;
		tamanho = 0;
	}

	@Override
	public void adicionarInicio(T elemento) {
		No<T> no = new No<T>(elemento, head);

		head = no;

		if (vazia())
			tail = head;
		++tamanho;
	}

	@Override
	public void adicionarFim(T elemento) {
		No<T> no = new No<T>(elemento, null);

		if (vazia())
			head = no;
		else
			tail.setProximo(no);

		tail = no;

		++tamanho;
	}

	@Override
	public void removerInicio() {
		if (vazia())
			throw new RuntimeException("Lista Vazia");
		head = head.getProximo();
		--tamanho;

		if (vazia())
			tail = null;
	}

	@Override
	public void removerFim() {
		if (vazia())
			throw new RuntimeException("Lista Vazia");
		No<T> ant = head;

		for (int i = 1; i < tamanho - 1; ++i) {
			ant = ant.getProximo();
		}

		ant.setProximo(null);
		tail = ant;
		--tamanho;

		if (vazia()) {
			head = null;
			tail = null;
		}

	}

	@Override
	public T primeiro() {
		if (vazia())
			throw new RuntimeException("Lista Vazia");
		return head.getElemento();
	}

	@Override
	public T ultimo() {
		if (vazia())
			throw new RuntimeException("Lista Vazia");
		return tail.getElemento();
	}

	@Override
	public T buscar(int posicao) {
		if (vazia())
			throw new RuntimeException("Lista vazia");
		if (!(posicao < tamanho && posicao >= 0))
			throw new RuntimeException("Posicao Invalida");

		No<T> ant = head;

		for (int i = 0; i < posicao; i++) {
			ant = ant.getProximo();
		}

		return ant.getElemento();
	}

	@Override
	public void adicionar(int posicao, T elemento) {
		if (!(posicao < tamanho && posicao >= 0))
			throw new RuntimeException("Posicao Invalida");

		No<T> ant = head;

		for (int i = 0; i < posicao - 1; i++) {
			ant = ant.getProximo();
		}

		No<T> no = new No<T>(elemento, ant.getProximo());
		ant.setProximo(no);

		tamanho++;
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