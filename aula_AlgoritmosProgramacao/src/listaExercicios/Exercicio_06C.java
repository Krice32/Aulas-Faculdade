package listaExercicios;
import java.util.Scanner;
public class Exercicio_06C {

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		double area,A,B,C;
		
		System.out.println("Digite a base maior do trap�zio: ");
		A = entrada.nextDouble();
		
		System.out.println("Digite a base menor do tr�pezio: ");
		B = entrada.nextDouble();
		
		System.out.println("Digite a altura do tr�pezio: ");
		C = entrada.nextDouble();
		
		area = ((A+B)*C)/2;
		
		System.out.println("A �rea do tr�pezio �: "+area);
		
		entrada.close();
	}
}
