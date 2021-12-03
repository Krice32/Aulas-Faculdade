package listaExercicios3;

import java.util.Scanner;

public class Exercicio8 {
	static int entradaDados() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Digite um valor :");
		num = entrada.nextInt();
		entrada.close();
		return num;

	}

	static boolean numerosPrimos() {

		int numero = entradaDados();
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0)

				return false;

		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(numerosPrimos());
	}
}
