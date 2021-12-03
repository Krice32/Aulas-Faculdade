package listaExercicios;
import java.util.Scanner;
public class Exercicio_08 {
	
	public static void main (String[]args) {
		double n1,n2,n3,n4,media;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o 1º valor: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite o 2º valor: ");
		n2 = entrada.nextDouble();
		System.out.println("Digite o 3º valor: ");
		n3 = entrada.nextDouble();
		System.out.println("Digite o 4º valor: ");
		n4 = entrada.nextDouble();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("A média dos valores que você inseriu é: " + media);
		
		entrada.close();
	}
}
