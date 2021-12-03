package listaExercicios3;

import java.util.Scanner;

public class Exercicio3 {
	static int fatorial() {
		int num, fatorial = 1;

		num = entradaDados();
		for (int i = 1; i <= num; i++) {
			fatorial = fatorial * i;

		}
		return fatorial;

	}

	static int entradaDados() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Digite um número : ");
		num = entrada.nextInt();
		entrada.close();
		return num;

	}

	public static void main(String[] args) {
		int z = fatorial();
		System.out.println("O fatorial é igual " + z);
	}
}
