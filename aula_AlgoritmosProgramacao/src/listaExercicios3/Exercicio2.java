package listaExercicios3;

import java.util.Scanner;

public class Exercicio2 {

	static int somatoria() {
		int num, i = 1, soma = 0;
		num = entradaDados();
		if (num <= 0) {
			System.out.println("Valor invalido");
			System.exit(num);
		}

		while (i < num) {
			i++;
			soma = i;
			soma += i;
		}

		return soma;
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
		int z = somatoria();

		System.out.println("Soma dos numeros inteiros anterios é igual a :" + z);
	}
}
