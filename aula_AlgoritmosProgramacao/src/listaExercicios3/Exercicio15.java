package listaExercicios3;

import java.util.Scanner;

public class Exercicio15 {
	
	static int entradaDados() {
		int num;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		
		
		
		return  num;
		
	}
	
	static int conta() {
		
		int x, z;
		
		System.out.println("Digite o valor de X: ");
		x = entradaDados();
		System.out.println("Digite o valor de Z: ");
		z = entradaDados();
		
	
		
		    int result = 1;
		   
		    for(int i=0 ; i < z ; i++)
		    {
		        result *= x;
		    }
		   
		    return result;
		

		
	}

	public static void main(String[] args) {
	
		System.out.println(conta());
	}

}
