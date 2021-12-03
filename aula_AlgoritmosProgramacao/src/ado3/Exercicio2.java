package ado3;
import java.util.Scanner;
public class Exercicio2 {
	
	public static void main (String[]args) {
		
		int i ;
		int x ;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor de X: ");
		x = entrada.nextInt();
		
		for (i= 1; i<=x; i++) {

			if (i%2==1) {
			System.out.println(i);
	
			}
	      
			entrada.close();

		}
		System.out.println("Fim");
	
	}
}