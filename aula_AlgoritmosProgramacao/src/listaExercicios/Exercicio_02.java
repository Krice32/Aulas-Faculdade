package listaExercicios;
import java.util.Scanner;
public class Exercicio_02 {

	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int base,expoente,soma;
		
		System.out.println("Digite dois n�meros, sendo o primeiro a base e o segundo o expoente: ");
		System.out.println("Digite o 1� valor: ");
		base= entrada.nextInt();
		System.out.println("Digite o 2� valor: ");
		expoente = entrada.nextInt();
		
		soma = (int) Math.pow(base, expoente);
		
		System.out.println(soma);

		entrada.close();
	}
}
