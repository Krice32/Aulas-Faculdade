package ado4;
import java.util.Scanner;
public class Exercicio1 {
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		int Dia;
		
		System.out.println("Digite um n�mero para saber o dia da semana\n ");
		
		Dia=entrada.nextInt();
		
		switch (Dia) {
		
		case 1 :
			System.out.println("Domingo");
			break;
			
		case 2 :
			System.out.println("Segunda-Feira");
			break;
			
		case 3 :
			System.out.println("Ter�a-Feira");
			break;
			
		case 4:
			System.out.println("Quarta-feira");
			break;
			
		case 5:
			System.out.println("Quinta-feira");
			break;
			
		case 6:
			System.out.println("Sexta-feira");
			break;
			
		case 7:
			System.out.println("S�bado");
			break;
			
		default:
				System.out.println("A opera��o � invalida ");
			entrada.close();
		}
	}
}
