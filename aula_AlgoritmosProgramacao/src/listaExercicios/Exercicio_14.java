package listaExercicios;
import java.util.Scanner;
public class Exercicio_14 {

	public static void main (String[]args ) {
		Scanner entrada = new Scanner (System.in);
		
		double valor1,valor2,divisao;
		
		System.out.println("Digite o 1� valor: ");
		valor1 = entrada.nextDouble();
		
		System.out.println("Digite o 2� valor: ");
		valor2 = entrada.nextDouble();
		
		if
		(valor1>valor2) {
			divisao = valor1/valor2;
		System.out.println("a divis�o fica "+ divisao);
		
		}else {
			divisao = valor2/valor1;
			System.out.println("a divis�o fica "+ divisao);
			
			
			entrada.close();
		}
	}
}
