package aula_algoritmol;
import java.util.Scanner;
public class Maior {
	 
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int idade;
		
	System.out.println("Digite sua idade");
	idade = entrada.nextInt();
	if(idade>=18) {
		System.out.println("Voc� � maior de idade");

	}else {
		System.out.println("Voc� � menor de idade ");
		
		entrada.close();
	
  }
 }
}
