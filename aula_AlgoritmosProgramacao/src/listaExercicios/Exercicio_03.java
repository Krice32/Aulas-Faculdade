package listaExercicios;
import java.util.Scanner;
public class Exercicio_03 {

	public static void main(String[]args) {
		
		int valor1,valor2,soma1,soma2;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o 1º valor: ");
		valor1 = entrada.nextInt();
		
		System.out.println("Digite o 2º valor: ");
		valor2 = entrada.nextInt();
		
		soma1 = valor1*valor1;
		soma2 = valor2*valor2;
		
		System.out.println("A soma ao quadrado dos valores que você informou é : "+soma1 +" e "+soma2 );
		System.out.println("E a soma dos quadrados é "+ (soma1+soma2));
		
		entrada.close();
	}
}
