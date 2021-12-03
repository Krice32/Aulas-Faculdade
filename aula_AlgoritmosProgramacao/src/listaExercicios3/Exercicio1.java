package listaExercicios3;

import java.util.Scanner;

public class Exercicio1 {
	static int entradaDados() {
		int a, b, c;
		
		Scanner entrada = new Scanner(System.in);
		int menor = 0,valor = 0;
		valor++;
		System.out.println("Digite o " + valor + "º valor: ");
		a = entrada.nextInt();
		valor++;
		System.out.println("Digite o " + valor + "º valor: ");
		b = entrada.nextInt();
		valor++;
		System.out.println("Digite o " + valor + "º valor: ");
		c = entrada.nextInt();
		
		if (a<b && a<c) {
			menor = a;
			
		}else if (b < a && b < c) {
			menor = b;
		} else {
			menor = c;
			entrada.close();
		}
		return menor;

	}
	
	public static void main (String[]args) {
		 int d = entradaDados();
		System.out.println("O menor valor é "+d);
	}
}
