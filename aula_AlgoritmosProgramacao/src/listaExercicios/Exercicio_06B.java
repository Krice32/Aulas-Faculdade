package listaExercicios;
import java.util.Scanner; 
public class Exercicio_06B {

	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		double C, pi = 3.14159, calculo;
		
		System.out.println("Digite o raio da área do circulo: ");
		C = entrada.nextDouble();
		
		calculo = Math.pow(C, 2)*pi;
		
		System.out.println("O raio da área do circulo é: "+calculo);
		
		entrada.close();
	}
}
