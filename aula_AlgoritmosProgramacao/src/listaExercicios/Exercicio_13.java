package listaExercicios;
import java.util.Scanner;
public class Exercicio_13 {

	
	
	public static void main (String[]args) {
		
		int a,b,c;
		Scanner entrada = new Scanner (System.in);
	
	System.out.println("Digite o 1º valor: ");
	a = entrada.nextInt();
	
	System.out.println("Digite o 2º valor: ");
	b = entrada.nextInt();
	
	System.out.println("Digite o 3º valor: ");
	c = entrada.nextInt();
	
	if 
	(a>b && a>c)
	System.out.println("O maior valor é "+a);
	
	else if
	(b>c && b>a)
	System.out.println("O maior valor é "+b);
	
	else
	System.out.println("O maior valor é "+c);
	
	entrada.close();
	}
}
