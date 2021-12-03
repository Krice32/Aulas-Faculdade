package ado2;
import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int n,numero,conta;
		
		System.out.println("Digite um número para ser calculado na tabuada: ");
		n = entrada.nextInt();
				
		for (numero = 1; numero<11; numero++) {

		
		conta = n*numero;
		
		System.out.println(n +" x "+ numero + " = " + conta  );
		
		entrada.close();
	

		}
	}

}