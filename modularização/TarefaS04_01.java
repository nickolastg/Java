package modulariza��o;

class TarefaS04_01 {
	  public static void main(String[] args) {
	    String nome = args[0];

	    double[] notas = new double[args.length-1];

	    if (notas.length >= 2){
	      for (int i = 0; i < notas.length; ++i){
	        notas[i] = Double.parseDouble(args[i+1]);
	    }
	      double media = Estatistica.calcularMedia(notas); 
	      exibirNota(media, nome);

	      double maior = Estatistica.calculoMaior(notas);
	      exibirMaior(maior);

	      double menor = Estatistica.calculoMenor(notas);
	      exibirMenor(menor);

	    }else{System.out.println("Voc� digitou menos de duas notas.");}
	  }
	  // "Jo�o da Silva tem m�dia 9.5"
	  public static void exibirNota(double nota, String nome){
	    System.out.println("" + nome + " tem m�dia: " + String.format("%.2f", nota));
	  }
	  public static void exibirMaior(double maiorNota){
	    System.out.println("A maior nota do aluno �: " + String.format("%.2f", maiorNota));
	  }
	  public static void exibirMenor(double menorNota){
	    System.out.println("A menor nota do aluno �: " + String.format("%.2f", menorNota));
	  }

}
