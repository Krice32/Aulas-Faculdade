package listaExercicios;
import java.util.Scanner;
public class Exercicio_01 {


	

	
	public static void main (String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int valor1,valor2,mult;
		
		System.out.println("Digite dois valores para multiplica��o");
		System.out.println("\nDigite o 1� valor: ");
		valor1 = entrada.nextInt();
		System.out.println("Digite o 2� valor: ");
		valor2=entrada.nextInt();
		
		mult = valor1*valor2;
		
		System.out.println("O valor final � " + mult);
		entrada.close();
	}
}
