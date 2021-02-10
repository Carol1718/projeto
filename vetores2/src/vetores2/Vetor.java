package vetores2;

public class Vetor {

	public static void main(String[] args) {
		double notas[] = {8.5, 9.3, 7.2, 9.7};
		  
		  System.out.println("Média = " + media(notas));
	
		  
		  double idades[] = {46, 17, 17, 16,
				  17, 17, 17, 16,
				  17, 22, 17, 19,
				  16, 16, 17, 16,
				 16};
	    
		 
		  System.out.println(" Media das Idades = " + media(idades));
		  System.out.println(" Soma das notas = " + soma(notas));
		  
		  double peso[] = {65, 89, 50, 48, 100, 65, 78, 54};
		  
		  System.out.println("Media dos pesos = " + media(peso));
		  System.out.println(" Total de peso = " + soma(peso));
		  
		  String[] nomes = {"Ana", "Pedro", "Luiz", "Fabiana"};
		  
		  for (int i = 0; i < nomes.length; i++) {
		 System.out.println(nomes[i]);
		 
		  }
		}
	
	private static double media(double vetor[]) {
 	 double soma = 0;

// 	 for(int i = 0; i < vetor.length; i++) {
// 		 soma += vetor[i];
// 	 }
	 
	 int i = 0;
	 while (i < vetor.length) {
		 soma += vetor[i];
		 i++;
	 }
 	
 	 return soma / vetor.length;
 	 
	}
 	 

   private static double soma(double vetor[]) {
  	 double soma = 0;
  	 
  	 for( int i = 0; i < vetor.length; i++) {
  		 soma += vetor[i];
  	 }
  	
  	 return soma;
  	 
   }
   
	}