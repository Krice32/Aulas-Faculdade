package aula_Pi;
import java.util.Scanner;
public class Calculadora {
	
	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a,b;
		String Operacaostri;
		char operacao;
		
		System.out.println("Escolha que tipo de conta vocÊ gostaria de fazer:");
		System.out.println("<A>dição");
		System.out.println("<S>ubtração");
		System.out.println("<M>ultiplicação");
		System.out.println("<D>ivisão");
		
		Operacaostri = entrada.next();
		operacao = Operacaostri.charAt(0);
		
		System.out.println("Digite qual o 1ª valor da operação");
		a = entrada.nextDouble();
		System.out.println("Digite qual o 2º valor da operação");
		b = entrada.nextDouble();
		
		if(operacao == 'a' || operacao == 'A') {
		System.out.println("A soma de "+ a+" e "+b+ " é: "+(a+b));
		
		}else if (operacao == 's' || operacao == 'S') {
			System.out.println("A subtração de " +a+ " e "+ b+ " é: "+ (a-b));
			
		}else if (operacao == 'm' || operacao == 'S') {
			System.out.println(" A multiplicação de "+ a + "e "+ b + "é: "+ (a*b));
		}else if (operacao == 'd'|| operacao == 'D'){
			System.out.println("A divisão de "+ a+ " e " +b+ "é: "+ (a/b));
			
		}else {
			System.out.println("Operação inválida");
	
			entrada.close();
		}
	
	}
}
