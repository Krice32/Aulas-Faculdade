package aulas;
import java.util.Scanner;
public class LacoRepeticaoFor3 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		int i, x , soma = 0, negativo = 0;
		
		for (i = 0; i<10; i++) {
			System.out.println("Digite um número: " );
			x = entrada.nextInt();
			
			
			if (x > 0) 
				soma = soma + x;
			System.out.println("\nA soma de números positivos é: "+soma);
			
			 if (x < 0) 
				negativo = negativo + x;
			System.out.println("\nA soma de números negativos é :"+ negativo);
			
			
			entrada.close();
			
		}
	}

}
