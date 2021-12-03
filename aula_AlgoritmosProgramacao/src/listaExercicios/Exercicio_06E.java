package listaExercicios;
import java.util.Scanner;
public class Exercicio_06E {
	
	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A,B,calculo;
		
		System.out.println("Digite a base de um ratângulo: ");
		A = entrada.nextDouble();
		
		System.out.println("Digite a altura de um retângulo: ");
		B = entrada.nextDouble();
		
		calculo = A*B;
		
		System.out.println("A área do retângulo é : "+ calculo);

		entrada.close();
	}

}
