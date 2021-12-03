package listaExercicios2;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		int contador = 0, alunos, i = 0;
		float notas, totalNotas = 0, media;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o número de alunos: ");
		alunos = entrada.nextInt();

		while (contador < alunos) {

			contador++;
			i++;

			System.out.println("Informe a nota do " + i + "º aluno");
			notas = entrada.nextFloat();

			totalNotas += notas;

		}
		media = totalNotas / alunos;

		System.out.println("A media da turma é " + media);
		
		entrada.close();

	}
}
