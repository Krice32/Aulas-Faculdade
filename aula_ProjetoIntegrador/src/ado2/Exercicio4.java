package ado2;
import java.util.Scanner;
public class Exercicio4 {

	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		String nome;
		System.out.println("Digite um nome e descubra a quantidade de caracteres que ele possui: ");
		nome = entrada.next();
		System.out.println(nome.length());
	
		entrada.close();
	}
}
