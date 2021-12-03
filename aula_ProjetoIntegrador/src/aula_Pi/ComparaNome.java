package aula_Pi;
import java.util.Scanner;
public class ComparaNome {

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome :");
		nome = entrada.next();
		
		if (nome.equalsIgnoreCase("John")) {
			System.out.println("Seu nome é John");
		
		}else 
			System.out.println("Seu nome é "+ nome + ", não John");
		
		entrada.close();
	}
	
}
