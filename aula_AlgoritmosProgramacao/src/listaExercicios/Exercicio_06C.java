package listaExercicios;
import java.util.Scanner;
public class Exercicio_06C {

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		double area,A,B,C;
		
		System.out.println("Digite a base maior do trapézio: ");
		A = entrada.nextDouble();
		
		System.out.println("Digite a base menor do trápezio: ");
		B = entrada.nextDouble();
		
		System.out.println("Digite a altura do trápezio: ");
		C = entrada.nextDouble();
		
		area = ((A+B)*C)/2;
		
		System.out.println("A área do trápezio é: "+area);
		
		entrada.close();
	}
}
