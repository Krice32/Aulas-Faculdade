package listaExercicios;
import java.util.Scanner;
public class Exercicio_06A {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		double A, B= 2, C, calculo ;
		
		System.out.println("Informe a base do tri�ngulo ret�ngulo: ");
		A = entrada.nextDouble();
		
		System.out.println("Infome a altura do tri�ngulo ret�ngulo: ");
		C = entrada.nextDouble();
		
		calculo = (A*C)/B;
		
		System.out.println("A �rea do tri�ngulo ret�ngulo �: " + calculo);
		
		entrada.close();
	}
}
