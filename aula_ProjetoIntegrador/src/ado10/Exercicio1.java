package ado10;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int sorteio, resposta, chances = 5;
		Scanner entrada = new Scanner(System.in);

		System.out.println("###ADIVINHE O NÚMERO###");

		sorteio = (int) (Math.random() * 100);

		int i = 0;
		while (i <= chances) {
			i++;
			System.out.println("Digite um número: ");
			resposta = entrada.nextInt();

			if (resposta == sorteio) {
				System.out.println("Parabéns você ganhou");
				System.exit(0);
			} else if (resposta == (sorteio + 1) || (resposta == (sorteio - 1))) {
				System.out.println("TÁ QUENTE !!!");
			} else if (resposta > sorteio) {
				System.out.println("Menos");
			} else if (resposta < sorteio) {
				System.out.println("Mais");
			}
			if (i >= 5) {
				System.out.println("Você gastou todas suas chances\nGamer Over");
				System.out.println("A reposta correta era: " + sorteio);
				break;
			}
		
		}
		entrada.close();
	}

}
