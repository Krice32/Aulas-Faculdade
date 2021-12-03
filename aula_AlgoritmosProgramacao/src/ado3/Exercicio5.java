package ado3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n, conta = 11;
		int multiplica = 0, tabuada = 0;

		System.out.println("Digite o valor de N: ");
		n = entrada.nextInt();

		if (n >= 2 && n <= 1000) {

			do {

				System.out.println("A tabuada é " + multiplica + " x " + n + " = " + tabuada);
				multiplica++;
				tabuada = n * multiplica;

			} while (multiplica < conta);
			entrada.close();
		}
	}
}