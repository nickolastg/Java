package TarefaS02_01;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
		  	Scanner sc = new Scanner(System.in);

		    System.out.println("Digite o n�mero de notas a serem inseridas");
		    int numeronotas = sc.nextInt();

		    float[] notas = new float[numeronotas];
		    //  System.out.println("Entre com nota 1:");
		    //  notas[0] = sc.nextFloat();
		    //  System.out.println("Entre com nota 2:");
		    //  notas[1] = sc.nextFloat();
		    //  System.out.println("Entre com nota 3:");
		    //  notas[2] = sc.nextFloat(Int);

		    for(int i = 0; i < numeronotas; ++i){
		      System.out.println("Entre com a nota " +(i+1));
		      notas[i] = sc.nextFloat();
		    }
		    float x = 0;
		    for (int i = 0; i < notas.length; ++i){
		      x = x + notas[i];
		    }

		    float media = x/numeronotas;
		    System.out.println("A M�dia �: " + media);
		    sc.close();
		  }
}
