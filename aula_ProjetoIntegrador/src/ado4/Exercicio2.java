package ado4;
import java.util.Scanner;
public class Exercicio2 {

	public static void main (String []args) {
		
		Scanner entrada = new Scanner(System.in);
		String questao;

		
		System.out.println("CONVERTA OS ALGORITMOS PARA BIN�RIO");
		System.out.println("Qual destas op��es � equivalente ao resultado da convers�o de hexadecimal para bin�rio\nN�mero: F902B ");
		System.out.println("A) 1101 0111 0000 0010 1010\nB) 1110 1001 0000 0011 1101\nC) 1111 1001 0000 0011 1011\nD) 1111 1001 0000 0010 1011\nE) 1111 1010 0000 0101 1011");
		questao = entrada.next();

		
		
		switch (questao) {
		
		case "A" : 
		case "a" :
			System.out.println("resposta incorreta :");
			break;
			
		case "B" :
		case "b" :
			System.out.println("Resposta incorreta" );
			break;
			
		case "C" : 
		case "c" :
	
			System.out.println("Resposta incorreta");
			break;
			
		case "D" : 
		case "d" :
			System.out.println("Resposta correta");
			break;
			
		case "E" : 
		case "e" :
			System.out.println("Resposta incorreta");
			break;
			
		default: 
			System.out.println("Opera��o inv�lida");
			
			entrada.close();
		}
	}
}
