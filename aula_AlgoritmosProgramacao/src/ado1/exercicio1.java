package ado1;
import java.util.Scanner;
public class exercicio1 {

	public static void main (String[]args) {
		
	
	Scanner entrada = new Scanner (System.in);
	int n1,soma;

	System.out.println("###C�lculando n�meros###");
	System.out.println("Digite um n�mero\nCaso seja maior que 100 ele ir� calcular 150 ao seu n�mero");
	n1 = entrada.nextInt();
	
	if
	(n1>=100) {
		soma = n1 + 150;
		System.out.println("O resultado � " + soma);
	}else {
		System.out.println("O n�mero n�o � maior que 100\nVoc� digitou "+n1);
	}
	entrada.close();
	}

}
