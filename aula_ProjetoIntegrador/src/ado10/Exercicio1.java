package ado10;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int sorteio, resposta, chances = 5;
		Scanner entrada = new Scanner(System.in);

		System.out.println("###ADIVINHE O N�MERO###");

		sorteio = (int) (Math.random() * 100);

		int i = 0;
		while (i <= chances) {
			i++;
			System.out.println("Digite um n�mero: ");
			resposta = entrada.nextInt();

			if (resposta == sorteio) {
				System.out.println("Parab�ns voc� ganhou");
				System.exit(0);
			} else if (resposta == (sorteio + 1) || (resposta == (sorteio - 1))) {
				System.out.println("T� QUENTE !!!");
			} else if (resposta > sorteio) {
				System.out.println("Menos");
			} else if (resposta < sorteio) {
				System.out.println("Mais");
			}
			if (i >= 5) {
				System.out.println("Voc� gastou todas suas chances\nGamer Over");
				System.out.println("A reposta correta era: " + sorteio);
				break;
			}
		
		}
		entrada.close();
	}

}
