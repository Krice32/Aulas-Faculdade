package ado1;
import java.util.Scanner;
public class exercicio1 {

	public static void main (String[]args) {
		
	
	Scanner entrada = new Scanner (System.in);
	int n1,soma;

	System.out.println("###Cálculando números###");
	System.out.println("Digite um número\nCaso seja maior que 100 ele irá calcular 150 ao seu número");
	n1 = entrada.nextInt();
	
	if
	(n1>=100) {
		soma = n1 + 150;
		System.out.println("O resultado é " + soma);
	}else {
		System.out.println("O número não é maior que 100\nVocê digitou "+n1);
	}
	entrada.close();
	}

}
