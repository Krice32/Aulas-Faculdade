package aulas;
import java.util.Scanner;
public class LacoRepeticaoFor3 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		int i, x , soma = 0, negativo = 0;
		
		for (i = 0; i<10; i++) {
			System.out.println("Digite um n�mero: " );
			x = entrada.nextInt();
			
			
			if (x > 0) 
				soma = soma + x;
			System.out.println("\nA soma de n�meros positivos �: "+soma);
			
			 if (x < 0) 
				negativo = negativo + x;
			System.out.println("\nA soma de n�meros negativos � :"+ negativo);
			
			
			entrada.close();
			
		}
	}

}
