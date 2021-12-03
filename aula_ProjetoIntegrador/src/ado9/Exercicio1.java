package ado9;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int min, max, resul;

		System.out.println("###EQUAÇÃO DE 1º GRAU###");
		System.out.println("Digite o valor minimo para a equação: ");
		min = entrada.nextInt();
		System.out.println("Digite o valor máximo para a equação : ");
		max = entrada.nextInt();

		int a = (int) ((Math.random() * ((max - min) + 1)) + min);
		int b = (int) ((Math.random() * ((max - min) + 1)) + min);

		if (a == 0) {
			System.out.println("Não tem como fazer essa conta, pois A é igual a 0");
			System.exit(0);
		}

		System.out.println(a + "x + " + b + " = 0\n");
		System.out.println(a + "x = " + 0 + (0 - b) + "\n");
		resul = (0 - b);
		System.out.println(a + "x = " + (resul) + "\n");
		System.out.println("x = " + resul + "/" + a + "\n\nx=" + ((double) resul / (double) a));

		entrada.close();
	}

}
