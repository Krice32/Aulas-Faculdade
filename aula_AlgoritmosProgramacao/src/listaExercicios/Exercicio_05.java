package listaExercicios;
import java.util.Scanner;
public class Exercicio_05 {

	public static void main(String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		double L, area;
		
		System.out.println("Digite o valor de L: ");
		L = entrada.nextDouble();
		
		area = Math.pow(L, 2);
		
		System.out.println("A área do quadrado do valor que você informou é : "+area);
		
		entrada.close();
		
	}
}
