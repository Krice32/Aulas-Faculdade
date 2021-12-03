package listaExercicios;
import java.util.Scanner;
public class Exercicio_15 {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A,B,C;
		double delta,x1,x2;
		
		System.out.println("Digite o valor de A: ");
		A = entrada.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = entrada.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = entrada.nextInt();
		
		delta =  Math.pow(B, 2) - (4 * A * C);
		
		if 
		(delta > 0 ) {
			x1 = (-B + Math.sqrt(delta))/(2 * A);
			x2 = (-B - Math.sqrt(delta))/(2 * A);
			System.out.println("X1 = "+x1+"\nX2 = "+x2);
			
		}else if
		(delta<0 || delta == 0) {
			System.out.println("Impossível calcular");
			
			entrada.close();
		}
			
	}
}
