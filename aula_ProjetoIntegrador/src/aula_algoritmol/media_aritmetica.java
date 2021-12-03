package aula_algoritmol;
import java.util.Scanner;
public class media_aritmetica {

	
		public static void main (String[]args) {
			Scanner entrada = new Scanner(System.in);
			String nomeAluno;
			float n1,n2,n3,media;
			System.out.println("Digite seu nome ai mano : ");
			nomeAluno = entrada.next();
			System.out.println("Digite sua 1ª nota ");
			n1 = entrada.nextFloat();
			System.out.println("Digite sua 2ª nota ");
			n2 = entrada.nextFloat();
			System.out.println("Digite sua 3ª nota ");
			n3 = entrada.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.println(nomeAluno + " sua média foi " + media);
			entrada.close();
		}
}
