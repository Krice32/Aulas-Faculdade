package aulas;
import java.util.*;
public class LacoRepeticaoFor2 {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		int i,valor;
		System.out.println("Digite um número");
		valor = entrada.nextInt();
		
		for (i= valor; i < 10; i++) {
			System.out.println(i);
			entrada.close();
		}
	}
}
