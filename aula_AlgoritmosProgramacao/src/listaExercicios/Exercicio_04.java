package listaExercicios;
import java.util.Scanner;
public class Exercicio_04 {

	public static void main(String []args) {
		int n1,n2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos descobri quais os n�meros sucessores dos seus digitados");
		System.out.println("Digite o 1� valor: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o  2� valor: ");
		n2 = entrada.nextInt();
		
		n1 ++;
		n2 ++;
		
		System.out.println("Os valores sucessores dos que voc� digitou � " + n1 + " e " + n2);
		entrada.close();
	}
	
}
