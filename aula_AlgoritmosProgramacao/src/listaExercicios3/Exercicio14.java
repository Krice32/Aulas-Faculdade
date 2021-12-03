package listaExercicios3;

import java.util.Scanner;

public class Exercicio14 {
	
	static int entradaDados() {
		int num;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner ( System.in);
		num = entrada.nextInt();
		
		return num;
		
	}
	static int conta() {
		int a,n, soma = 0;
		System.out.print("valor de A : ");
		a = entradaDados();
		System.out.print("valor de N : ");
		n = entradaDados();
		
		soma = n;
		soma += n+a;
		
		
		
		return soma;
		
		
	}
	public static void main (String[]args) {
		
		System.out.println(conta());
	}
}
