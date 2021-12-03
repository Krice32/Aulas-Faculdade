package ado2;
import java.util.Scanner;
public class Exercicio2 {

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int n1,soma1,soma2,soma3;
		System.out.println("Digite um número e veja os multiplos do mesmo valor:");
		n1 = entrada.nextInt();
		
		soma1 = n1*n1;
		soma2 = n1*n1*n1;
		soma3 = n1*n1*n1*n1;
		System.out.println("os valores são : " + n1 +","+ soma1 +","+ soma2 +"," + soma3);
		entrada.close();
	}
}
