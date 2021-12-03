package listaExercicios2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int n;
		int i = 1;
		int soma = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		System.out.print("");
		n = entrada.nextInt();

		while (i <= n) {

			i++;
			soma = soma + i;

		}

		System.out.println("O valor da soma dos numeros interos é: " + soma);

		entrada.close();
	}
}
