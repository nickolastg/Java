public class Main {
	public static void main(String[] args) {
		int[] numeros = { 4, 7, 8, 2, 11, 3, 9, 1 };
		int[] numerosOrdenadosBubble = Ordenacao.bubbleSort(numeros);
		int[] numerosOrdenadosInsertion = Ordenacao.insertionSort(numeros);

		VetorUtil.imprimirVetor(numeros);
		VetorUtil.imprimirVetor(numerosOrdenadosBubble);
		VetorUtil.imprimirVetor(numerosOrdenadosInsertion);
	}

}
