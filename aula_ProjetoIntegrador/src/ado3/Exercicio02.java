package ado3;
import java.util.Scanner;
public class Exercicio02 {

	public static void main (String[]args) {
	Scanner entrada = new Scanner(System.in);
	double a,b,c;
	System.out.println("Descubra qual o seu tri�ngulo :D \n");
	System.out.println("Digite a 1� medida: ");
	a = entrada.nextDouble();
	System.out.println("Digite a 2� medida: ");
	b= entrada.nextDouble()	;	
	System.out.println("Digite a 3� medida: ");
	c = entrada.nextDouble();
	
	if( a< (b+c) && b<(c+a) && c<(a+b)){
		//� um tri�ngulo
		

	} if (a==b && b==c) {
			
		System.out.println("As medidas formam um tri�ngulo equil�tero");
	
		
	}else if
		(a==b || b==c || c==a) {
			System.out.println("As medidas formam um tri�ngulo is�sceles");
	
	}
	else {
		System.out.println("As medidas formam um tri�ngulo escaleno");
		
		
			}	
	 entrada.close();
		}	
	}
	

	

