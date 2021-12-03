package ado4;

import java.util.Scanner;

public class Exercicio4 {

	static int funcao(int x) {
		if (x < -1) {
			x = (x + 2);
		}
		if (x <= -1 || x <= 2) {
			x = (x * x - 4);
		}
		if (x > 2) {
			x = ((x * 2) - 1);
		}
		return x;
	}

	public static int entradaDados() {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Insira o numero");
		num = entrada.nextInt();
		return num;

	}

	public static void main(String[] args) {
		int x;
		x = entradaDados();

		int z = funcao(x);
		System.out.println(z);
	}

}
