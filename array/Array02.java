package array;
import java.util.Scanner;
class Array02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com o n�mero de elementos");
    int numeroElementos = sc.nextInt();

    int[] numeros = new int[numeroElementos];

    for (int i = 0; i < numeroElementos; ++i){
      System.out.println("Entre com o n�mero " +(i+1));
      numeros[i] = sc.nextInt();
    }

    int maior = 0;
    int menor = 0;

    for (int i = 0; i < numeros.length; ++i){
      if (i==0){
        maior = numeros[i];
        menor = numeros[i];
      }
      else if (numeros[i] > maior){
        maior = numeros[i];
      }
      else if (numeros[i] < menor){
        menor = numeros[i];
      }
    }

    System.out.println("Maior n�mero: " + maior);
    System.out.println("Menor n�mero: " + menor);
    sc.close();
  }
}