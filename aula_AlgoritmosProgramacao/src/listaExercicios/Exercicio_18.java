package listaExercicios;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Exercicio_18 {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		 Double[] adfb= new Double[3];
	
		
		System.out.println("Informe o valor do lado A: ");
		adfb[0] = entrada.nextDouble();
		
		System.out.println("Informe o valor do lado B: ");
		adfb[1] = entrada.nextDouble();
		
		System.out.println("Informe o valor do lado C: ");
		adfb[2] = entrada.nextDouble();
		Arrays.sort(adfb,Collections.reverseOrder());
		 double A= adfb[0];
		 double B = adfb[1];
		 double C = adfb [2];

	        
	    	entrada.close();
		
		if (A >= (B + C)) {
			System.out.println("N�o forma um tri�ngulo");
			return;
			
		}if (A*A == (B*B + C*C)) {
			System.out.println("Forma um tri�ngulo ret�ngulo");

		}if (A*A > (B*B  + C*C)) {
			System.out.println("Forma um tri�ngulo obtus�ngulo");
			
		}if (A*A < (B*B + C*C)) {
			System.out.println("Forma um tri�ngulo acut�ngulo");
			
		}if (A == B && B==C && C==A) {
			System.out.println("Forma um tri�ngulo equil�tero");
			
		}if ((A == B && B!=C ) || (B==C && C!=A) || (A==C && B!=A)) {
			System.out.println("Forma um tri�ngulo is�sceles");
			
		
		}
		
	}
}
