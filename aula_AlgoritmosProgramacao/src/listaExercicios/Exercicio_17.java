package listaExercicios;
import java.util.Scanner;
public class Exercicio_17 {

	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		int A,B,C,D;
		
		System.out.println("Digite o valor de A: ");
		A = entrada.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = entrada.nextInt();

		System.out.println("Digite o valor de C: ");
		C = entrada.nextInt();
		
		System.out.println("Digite o valor de D: ");
		D = entrada.nextInt();
		
		
		
		if 
		(B > C && D > A && (C+D) > (A+B) && C>0 && D>0 && A%2==0 ) {
			System.out.println("Valores aceitos");
			
		}else {
			System.out.println("Valores n?o aceitos");
		
			entrada.close();
		
		}
	}
}
	