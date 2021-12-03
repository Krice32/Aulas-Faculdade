package listaExercicios;
import java.util.Scanner;
public class Exercicio_12 {

	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		double L,R, pi = 3.14159, raioCirculo, areaQuadrado;
		
		System.out.println("Digite o raio da área do circulo: ");
		R = entrada.nextDouble();
		
		raioCirculo = Math.pow(R, 2)*pi;
		
		System.out.println("Digite o lado do quadrado: ");
		L = entrada.nextDouble();
		
		areaQuadrado= Math.pow(L, 2);
		
		if 
		(raioCirculo > areaQuadrado) {
			System.out.println(raioCirculo+"\n"+areaQuadrado+ "\nO raio do circulo é maior");
		}else {
			System.out.println(areaQuadrado+"\n"+raioCirculo+"\nA área do quadrado é maior");
			
			entrada.close();
		}
		
	}
}