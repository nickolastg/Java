package ordenação;

public class Ordenacao {
    public static int[] bubbleSort(int[] vetor) {
        vetor = VetorUtil.copiar(vetor);

        int aux;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        return vetor;
    }

    public static int[] insertionSort(int vetor[]) {
        vetor = VetorUtil.copiar(vetor);

        for (int i = 1; i < vetor.length; ++i) {
            int aux = vetor[i];
            int j = i - 1;
            while (j > -1 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                --j;
            }
            vetor[j + 1] = aux;
        }

        return vetor;
    }

}
