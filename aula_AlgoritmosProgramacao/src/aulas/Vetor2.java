package aulas;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int t;

		

		System.out.println("Digite quanto a locação de memória do vetor: ");
		t = entrada.nextInt();
		
		int[] vetor = new int[t];
		// preenche o vetor
		for (int i = 0; i < t; i++) {

			System.out.printf("Vetor[%d]", i);
			vetor[i] = entrada.nextInt();

		}
		// imprime os elementos do vetor

		for (int i = 0; i < t; i++) {
			System.out.printf("vetor[%d]: %d\n", i, vetor[i]);

		}

	}

}
