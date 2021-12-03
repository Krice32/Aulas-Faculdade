package listaExercicios3;

import java.util.Scanner;

public class Exercicio4 {

	static int entradaDados() {
		int valor2;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor : ");
		valor2 = entrada.nextInt();

		return valor2;
	}

	static int fatorial() {
		int fatorial = 1;

		int recebe = entradaDados();

		for (int i = 1; i <= recebe; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;

	}

	static int somatoria() {
		int i = 1, soma = 0;

		int recebe = entradaDados();

		while (i < recebe) {
			i++;
			soma = i;
			soma += i;
		}

		return soma;
	}

	static int divisao(int a, int b) {
		return (a / b);
	}

	public static void main(String[] args) {

		int z = divisao(fatorial(), somatoria());
		System.out.println(z);
	}
}