package ado1;
import java.util.Scanner;
public class Exercicio3 {

	public static void main (String []args) {
		
		Scanner entrada = new Scanner(System.in);
		double altura, peso, massa;
		
		
		System.out.println("Informe seu peso: ");
		peso  = entrada.nextDouble();
		System.out.println("Informe sua altura: ");
		altura = entrada.nextDouble();
		
		massa = peso/(altura*altura);
		
		if 
		(massa <26) {
			System.out.println("Normal");
			
		}else if 
		(massa >26 && massa <30) {
			System.out.println("Obeso");
		
		}else { 
			System.out.println("Obeso mórbido ");
			
			entrada.close();
		}
	}
}
