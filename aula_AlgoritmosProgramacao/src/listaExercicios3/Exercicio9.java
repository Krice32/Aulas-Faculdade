package listaExercicios3;

import java.util.Scanner;

public class Exercicio9 {

	static int entradaDados() {
		int ano, mes, dias;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite sua idade ");
		ano = entrada.nextInt();
		System.out.println("Digite a quantos meses voc� fez anivers�rio : ");
		mes = entrada.nextInt();
		System.out.println("Agora escreva a quantos dias se passou desde o seu m�sversario");
		dias = entrada.nextInt();
		entrada.close();
		
		return (dias+(ano*365 + (mes*31)));
		
		
	}
	public static void main (String[]args) {
		
		System.out.println("Voc� tem "+entradaDados()+ " dias de vida ");
	}
}
