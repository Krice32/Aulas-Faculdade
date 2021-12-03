package listaExercicios3;

import java.util.Scanner;

public class Exercicio13 {
	static int entradaDados() {

		int num;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número e veja os seus divisores: ");
		num = entrada.nextInt();
		return num;

	}

	static int divisores() {

		int y = entradaDados();
		for (int i = y; i > 1; i--) {
			if (y % i == 0) {
				System.out.println(i);
			}

		}
		return 1;

	}

	public static void main(String[] args) {

		System.out.println(divisores());
	}
}
