package aula_Pi;
import java.util.Scanner;
public class Aula_java1 {

	public static void main(String[]args) { 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println(idade);
		entrada.close();
	}
}
