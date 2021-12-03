package listaExercicios2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		int numero, maior = 0, i;

		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º valor");
			numero = entrada.nextInt();

			if (numero > maior) {
				maior = numero;
			}

		}
		System.out.println("O maior valor digitado foi " + maior);
		entrada.close();

	}
}
