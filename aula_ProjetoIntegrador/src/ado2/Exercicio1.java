package ado2;
import java.util.Scanner;
public class Exercicio1 {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double  n1,n2,n3,soma;
		
		System.out.println("Digite o 1� valor: ");
		n1=entrada.nextDouble();
		
		System.out.println("Digite o 2� valor: ");
		n2=entrada.nextDouble();
		
		System.out.println("Digite o 3� valor: ");
		n3=entrada.nextDouble();
		
		
		soma = n1*n2*n3;
		System.out.println("Os valores digitados foram");
		System.out.println("o valor dos 3 produtos � " + soma);
		
		entrada.close();
	}
}
