package aula_algoritmol;
import java.util.Scanner;
public class Ou {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade=entrada.nextInt();
		
		if(idade>=18 || idade % 3==0 ) {
			System.out.println("Sim, você é maior de idade OU sua idade é multiplo de 3");
			
		}else {
			System.out.println("Você é menor de idade E sua idade não é multiplo de 3");
		}
		
		entrada.close();
	}
}
