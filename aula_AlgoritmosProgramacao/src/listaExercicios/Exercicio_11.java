package listaExercicios;
import java.util.Scanner;
public class Exercicio_11 {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero � irei te falar se � positivo ou negativo");
		numero = entrada.nextInt();
		
		if 
		(numero>=0)
		System.out.println("O n�mero � positivo");
		
		else
			System.out.println("O n�mero � negativo");
		
		entrada.close();
	}
}
