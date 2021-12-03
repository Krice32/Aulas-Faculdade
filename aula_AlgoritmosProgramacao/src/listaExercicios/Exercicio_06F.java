package listaExercicios;
import java.util.Scanner;
public class Exercicio_06F {

	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		double A,B,calculo;
		
		System.out.println("Digite o lado A para calcular o perimetro do retângulo: ");
		A = entrada.nextDouble();
		
		System.out.println("Digite o lado B para calcular o perimetro do retângulo:");
		B = entrada.nextDouble();
		
		calculo = (A*2) + (B*2);
		
		System.out.println("O perimetro do retângulo é: "+calculo);
		
		entrada.close();
	}
}
