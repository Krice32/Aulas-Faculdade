package listaExercicios;
import java.util.Scanner;
public class Exercicio_08 {
	
	public static void main (String[]args) {
		double n1,n2,n3,n4,media;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o 1� valor: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite o 2� valor: ");
		n2 = entrada.nextDouble();
		System.out.println("Digite o 3� valor: ");
		n3 = entrada.nextDouble();
		System.out.println("Digite o 4� valor: ");
		n4 = entrada.nextDouble();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("A m�dia dos valores que voc� inseriu �: " + media);
		
		entrada.close();
	}
}
