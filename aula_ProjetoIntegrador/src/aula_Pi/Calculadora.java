package aula_Pi;
import java.util.Scanner;
public class Calculadora {
	
	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a,b;
		String Operacaostri;
		char operacao;
		
		System.out.println("Escolha que tipo de conta voc� gostaria de fazer:");
		System.out.println("<A>di��o");
		System.out.println("<S>ubtra��o");
		System.out.println("<M>ultiplica��o");
		System.out.println("<D>ivis�o");
		
		Operacaostri = entrada.next();
		operacao = Operacaostri.charAt(0);
		
		System.out.println("Digite qual o 1� valor da opera��o");
		a = entrada.nextDouble();
		System.out.println("Digite qual o 2� valor da opera��o");
		b = entrada.nextDouble();
		
		if(operacao == 'a' || operacao == 'A') {
		System.out.println("A soma de "+ a+" e "+b+ " �: "+(a+b));
		
		}else if (operacao == 's' || operacao == 'S') {
			System.out.println("A subtra��o de " +a+ " e "+ b+ " �: "+ (a-b));
			
		}else if (operacao == 'm' || operacao == 'S') {
			System.out.println(" A multiplica��o de "+ a + "e "+ b + "�: "+ (a*b));
		}else if (operacao == 'd'|| operacao == 'D'){
			System.out.println("A divis�o de "+ a+ " e " +b+ "�: "+ (a/b));
			
		}else {
			System.out.println("Opera��o inv�lida");
	
			entrada.close();
		}
	
	}
}
