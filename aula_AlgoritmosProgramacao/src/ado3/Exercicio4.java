package ado3;
import java.util.Scanner;
public class Exercicio4 {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int valores = 0, media, soma = 0, i = 0, valor, positivos = 0;
		

		
		

		while (valores <6) {
		i++;
			valores++;
			System.out.println("Digite o "+i+ "º valor :");
			valor = entrada.nextInt();
			
			if ( valor > 0) {
				
				soma = soma+valor;
				
				positivos++;
			}
		
			
			
			}
		if (positivos>0) {
			System.out.println("os valores da soma são :"+ soma);
			
			System.out.println("Você informou "+positivos+ " valores positivos");
			
			media = soma/positivos;
			System.out.println("A média dos valores é : "+ media);
			}
		entrada.close();
		
	}
}
