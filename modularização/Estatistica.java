package modularização;

public class Estatistica {
    public static double calcularMedia(double[] valores) {
        double soma = 0.0;

        for (int i = 0; i < valores.length; ++i) {
            soma += valores[i];
        }

        return soma / valores.length;
    }
    public static double calculoMaior(double[] valores) {
        double maior = 0.0;

        for (int i = 0; i < valores.length; ++i) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }

        return maior;
    }
    public static double calculoMenor(double[] valores) {
        double menor = 0.0;

        for (int i = 0; i < valores.length; ++i) {
            if (i == 0) {
                menor = valores[i];
            } else if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        return menor;
    }
}
