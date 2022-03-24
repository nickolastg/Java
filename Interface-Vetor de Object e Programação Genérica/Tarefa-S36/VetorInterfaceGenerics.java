public interface VetorInterfaceGenerics<T> {
	void adicionar(T elemento);

	void adicionar(int posicao, T elemento);

	void remover(int posicao);

	T buscar(int posicao);

	int buscar(T elemento);

	int tamanho();

	public boolean contem(T elemento);
}