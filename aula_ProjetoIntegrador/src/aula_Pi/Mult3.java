package aula_Pi;
import java.util.Scanner;
public class Mult3 {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade=entrada.nextInt();
		
		if(idade>=18 && idade % 3==0 ) {
			System.out.println("Sim, você é maior de idade é " + idade + " é multiplo de 3");
			
		}else {
			System.out.println("Não, você não é maior de idade\nou sua idade não é multiplo de 3");
		}
		
		entrada.close();
	}
}
