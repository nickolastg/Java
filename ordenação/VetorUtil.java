package ordenação;

public class VetorUtil {
    public static int[] copiar(int[] vetor) {
        int[] novoVetor = new int[vetor.length];
        for (int i = 0; i < novoVetor.length; i++) {
            novoVetor[i] = vetor[i];
        }

        return novoVetor;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("------------------");
    }

}
