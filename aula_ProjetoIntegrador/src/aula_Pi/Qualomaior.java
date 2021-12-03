package aula_Pi;
import java.util.Scanner;
public class Qualomaior {

	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		int valorA,valorB,valorC;
		
		System.out.println("Digite o valor de A : ");
		valorA= entrada.nextInt();
		
		System.out.println("Digite o valor de B : ");
		valorB= entrada.nextInt();
		
		System.out.println("Digite o valor de C : ");
		valorC= entrada.nextInt();
		
		if ((valorA >valorB ) && (valorA>valorC))
			System.out.println("Valor de A é maior");
			
		else if ((valorB > valorA) && (valorB>valorC))
		System.out.println("Valor de B é maior");
		
		else 
			System.out.println("O valor de C é maior");
	
		entrada.close();
	}
}
