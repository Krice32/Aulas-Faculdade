package ado1;
import java.util.Scanner;
public class exercicio2 {
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner (System.in);
		int n1,n2,divisao;
		
		System.out.println("Calculadora de divis�o");
		System.out.println("Digite o 1� valor ");
		n1 = entrada.nextInt();
		System.out.println("Digite o 2� valor: ");
		n2 = entrada.nextInt();
		
		divisao = n1%n2; 
		
		if
		(divisao ==0) {
			System.out.println("O valores que voc� digitou o resto � igual a "+ divisao);
		}else if
			(divisao !=0 ) {
			System.out.println("Os valores que voc� digitou o resto � igual a " + divisao);
		}
		
		entrada.close();
	}
}
