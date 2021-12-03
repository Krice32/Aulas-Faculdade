package listaExercicios2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade, contador = 0, i = 0;
		String nome, sexo;
		int idadeMaisVelho = 0;
		String sexoMaisVelho = null, nomeMaisVelho = null;

		do {
			i++;
			System.out.println("Digite o nome do " + i + "ª aluno:");
			nome = entrada.next();
			System.out.println("Digite o idade do " + i + "º aluno:");
			idade = entrada.nextInt();
			System.out.println("Digite o sexo do " + i + "º aluno:");
			sexo = entrada.next();

			if (idade > idadeMaisVelho) {
				nomeMaisVelho = nome;
				sexoMaisVelho = sexo;
				idadeMaisVelho = idade;
			}

			contador++;
		} while (contador < 5);

		System.out.println("O aluno mais velho é :" + nomeMaisVelho + " que tem " + idadeMaisVelho
				+ " anos de idade, é do sexo " + sexoMaisVelho);
		
		entrada.close();
	}
}
