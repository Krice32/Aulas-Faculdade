package ado3;
import java.util.Scanner;
public class Exercicio03 {
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		 int ano;
		
		System.out.println("Digite o ano que gostaria de saber se � bissexto:");
		ano = entrada.nextInt();
		
		if (ano % 400==0) {
			System.out.println("Sim o ano de "+ano+" � bissexto");
			
		} else if ((ano %4 ==0) && (ano % 100 != 0)){
			System.out.println("Sim, o ano de "+ano+" � bissexto");
			
			
		}else {
			System.out.println("o ano "+ano+" n�o � bissexto");
			
			entrada.close();
		}
	}
}
