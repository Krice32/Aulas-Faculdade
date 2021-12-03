package ado3;
import java.util.Scanner;
public class Exercicio01 {

	public static void main (String[]args){
	Scanner entrada = new Scanner(System.in);
	String nome;
	float desconto, mercadorias, valorFinal;
	System.out.println("Sejam bem-vindos a loja do Erick");
	System.out.println("Qual o seu nome ? ");
	nome = entrada.next();
	
	System.out.println("Ok "+nome+" qual o valor de suas mercadorias ? ");
	mercadorias = entrada.nextFloat();
	
	if (mercadorias >= 300) {
		desconto = (float) (mercadorias*0.2);
		valorFinal = mercadorias - desconto;
		System.out.println("O preço final é de "+ valorFinal);
	}else {
		desconto = (float) (mercadorias*0.15);
		valorFinal = mercadorias - desconto;
		System.out.println("O preço final é de " + valorFinal);
		
		
		entrada.close();
	}
		
}
	}
