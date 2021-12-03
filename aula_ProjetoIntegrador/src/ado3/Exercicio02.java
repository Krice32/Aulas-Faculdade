package ado3;
import java.util.Scanner;
public class Exercicio02 {

	public static void main (String[]args) {
	Scanner entrada = new Scanner(System.in);
	double a,b,c;
	System.out.println("Descubra qual o seu triângulo :D \n");
	System.out.println("Digite a 1º medida: ");
	a = entrada.nextDouble();
	System.out.println("Digite a 2º medida: ");
	b= entrada.nextDouble()	;	
	System.out.println("Digite a 3º medida: ");
	c = entrada.nextDouble();
	
	if( a< (b+c) && b<(c+a) && c<(a+b)){
		//É um triângulo
		

	} if (a==b && b==c) {
			
		System.out.println("As medidas formam um triângulo equilátero");
	
		
	}else if
		(a==b || b==c || c==a) {
			System.out.println("As medidas formam um triângulo isósceles");
	
	}
	else {
		System.out.println("As medidas formam um triângulo escaleno");
		
		
			}	
	 entrada.close();
		}	
	}
	

	

