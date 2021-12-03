package listaExercicios2;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int x;
		int vezes;
		System.out.println("Insira o valor de vezes");
		vezes = entrada.nextInt();

		do {
			System.out.println("Insira um valor");
			x = entrada.nextInt();

			if (x % 2 == 0) {
				System.err.println("Par");
			}
			if (!(x % 2 == 0)) {
				System.err.println("Ímpar");

			}
			if (x < 0) {
				System.err.println("Numero negativo");
			}
			if (x == 0) {
				System.err.println("Nulo");
			}
			if (x > 0) {
				System.err.println("Positivo");
			}
			vezes = vezes - 1;

		} while (vezes > 0);
		entrada.close();

	}

}
