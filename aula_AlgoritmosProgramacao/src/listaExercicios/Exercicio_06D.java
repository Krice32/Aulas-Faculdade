package listaExercicios;
import java.util.Scanner;
public class Exercicio_06D {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		double B, calculo;
		
		System.out.println("Digite a área B do quadrado: ");
		B = entrada.nextDouble();
		
		calculo = Math.pow(B, 2);
		
		System.out.println("A área do quadrado é: " + calculo);
		
		entrada.close();
	}
}
