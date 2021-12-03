package aulas;

import java.util.Scanner;

public class Vetor3 {
	public static void main (String[]args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int n, menor,maior,soma = 0;
		
		
		System.out.printf("Tamanho do vetor: ");
		n = entrada.nextInt();
		
		// instanciar o vetor
		
		int[] vetor = new int [n];
		
		//prencher o vetor
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Vetor[%d]: \n", i );
			vetor[i] = entrada.nextInt();
			
			
			menor = vetor[0];
			maior = vetor[0];
			
			//percorrer o vetor 
			
			for (int j = 0; j <n; j++) {
				System.out.printf("vetor[%d] : %d \n", i, vetor[i]);

				soma = soma + vetor [i]; // soma += vetor[i]
				
				if (vetor [i]< menor ) {
					menor = vetor[i];
					
				}
				
				if (vetor[i] > maior) {
					maior = vetor[i];
				}
				
			}
			
			for (int j = 0; j < n; j++) {
				System.out.printf("vetor ["+i + "]:" + vetor[i]);
			
				if (vetor[i] == menor) {
					System.out.print("<- é o menor");
					
				}else if (vetor[i] == maior) {
					System.out.print("<- é o maior");
					
					
				}
				
				System.out.printf("\n");
			}
			System.out.println("Soma "+ soma);
			
		}
	}

}
