package listaExercicios;
import java.util.Scanner;
public class Exercicio_04 {

	public static void main(String []args) {
		int n1,n2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos descobri quais os números sucessores dos seus digitados");
		System.out.println("Digite o 1º valor: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o  2º valor: ");
		n2 = entrada.nextInt();
		
		n1 ++;
		n2 ++;
		
		System.out.println("Os valores sucessores dos que você digitou é " + n1 + " e " + n2);
		entrada.close();
	}
	
}
