package aula_Pi;
import java.util.Scanner;
public class CalculadoraSwitch {
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		double a,b;
		String operacaoStr;
		char operacao;
		
		System.out.println("Calculadora com Switch\n ");
		
		System.out.println("Escolha que tipo de conta voc� gostaria de fazer:");
		System.out.println("<A>di��o");
		System.out.println("<S>ubtra��o");
		System.out.println("<M>ultiplica��o");
		System.out.println("<D>ivis�o");
		
		operacaoStr = entrada.next();
		operacao = operacaoStr.charAt(0);
		
		System.out.println("Digite qual o 1� valor da opera��o");
		a = entrada.nextDouble();
		System.out.println("Digite qual o 2� valor da opera��o");
		b = entrada.nextDouble();
		
		switch (operacao) {
		case 'A':
		case 'a':
			
			System.out.println("A soma � " +(a+b));
			break;
			
		case 'S' :
		case 's' :
			System.out.println("A subtra��o � : "+(a-b));
			break;
			
		case 'M' :
		case 'm' :
			System.out.println("A multiplica��o � : "+(a*b));
			break;
			
		case 'D' :
		case 'd' :
			System.out.println("A divis�o � : "+ (a/b));
			break;
			
		default:
				System.out.println("A opera��o "+ operacaoStr+ " � invalida ");
			entrada.close();
		}
	}
}
