package listaExercicios;
import java.util.Scanner;
public class Exercicio_06E {
	
	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A,B,calculo;
		
		System.out.println("Digite a base de um rat�ngulo: ");
		A = entrada.nextDouble();
		
		System.out.println("Digite a altura de um ret�ngulo: ");
		B = entrada.nextDouble();
		
		calculo = A*B;
		
		System.out.println("A �rea do ret�ngulo � : "+ calculo);

		entrada.close();
	}

}
