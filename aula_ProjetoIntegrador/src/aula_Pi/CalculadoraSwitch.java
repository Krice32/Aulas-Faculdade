package aula_Pi;
import java.util.Scanner;
public class CalculadoraSwitch {
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		double a,b;
		String operacaoStr;
		char operacao;
		
		System.out.println("Calculadora com Switch\n ");
		
		System.out.println("Escolha que tipo de conta vocÊ gostaria de fazer:");
		System.out.println("<A>dição");
		System.out.println("<S>ubtração");
		System.out.println("<M>ultiplicação");
		System.out.println("<D>ivisão");
		
		operacaoStr = entrada.next();
		operacao = operacaoStr.charAt(0);
		
		System.out.println("Digite qual o 1ª valor da operação");
		a = entrada.nextDouble();
		System.out.println("Digite qual o 2º valor da operação");
		b = entrada.nextDouble();
		
		switch (operacao) {
		case 'A':
		case 'a':
			
			System.out.println("A soma é " +(a+b));
			break;
			
		case 'S' :
		case 's' :
			System.out.println("A subtração é : "+(a-b));
			break;
			
		case 'M' :
		case 'm' :
			System.out.println("A multiplicação é : "+(a*b));
			break;
			
		case 'D' :
		case 'd' :
			System.out.println("A divisão é : "+ (a/b));
			break;
			
		default:
				System.out.println("A operação "+ operacaoStr+ " é invalida ");
			entrada.close();
		}
	}
}
