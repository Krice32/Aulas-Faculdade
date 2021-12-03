package listaExercicios;
import java.util.Scanner;
public class Exercicio_07 {

	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		
		double A,B,h;
		
		System.out.println("Digite o lado A do cateto");
		A = entrada.nextDouble();
		
		System.out.println("Digite o lado B do cateto");
		B = entrada.nextDouble();
				
		h = Math.sqrt(Math.pow(A,2) + Math.pow(B, 2));
		
		System.out.println("A hipotenusa é: "+ h);
		entrada.close();
	}
}
