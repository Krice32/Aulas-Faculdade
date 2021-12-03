package calculadora;

import java.util.Scanner;

public class Funcoes {

	static void soma() {
		System.out.println("Digite o valor de x: ");
		int x1 = entrada.nextInt();
		System.out.println("Digite o valor de y: ");
		int y1 = entrada.nextInt();

		System.out.println("Resultado = " + (x1 + y1));

	}

	static void multiplicacao() {
		System.out.println("Digite o valor de x: ");
		int x1 = entrada.nextInt();
		System.out.println("Digite o valor de y: ");
		int y1 = entrada.nextInt();
		System.out.println("Resultado = " + (x1 * y1));

	}

	static void subtracao() {
		System.out.println("Digite o valor de x: ");
		int x1 = entrada.nextInt();
		System.out.println("Digite o valor de y: ");
		int y1 = entrada.nextInt();
		System.out.println("Resultado = " + (x1 - y1));

	}

	static void divisao() {
		System.out.println("Digite o valor de x: ");
		int x1 = entrada.nextInt();
		System.out.println("Digite o valor de y: ");
		int y1 = entrada.nextInt();
		System.out.println("Resultado = " + x1 / y1);

	}

	static Scanner input = new Scanner(System.in);

	static void raiz() {
		System.out.println("Digite o valor de x pra raiz quadrada");
		int x1 = input.nextInt();
		Math.sqrt(x1);
		System.out.println("Resultado = " + Math.sqrt(x1));

	}

	static void potencia() {
		System.out.println("Digite o valor de x: ");
		int x1 = entrada.nextInt();
		System.out.println("Digite o valor de y: ");
		int y1 = entrada.nextInt();
		System.out.println("Resultado = " + Math.pow(x1, y1));

	}

	static Scanner entrada = new Scanner(System.in);

	
	public static void main(String[] args) {
		int calculos = 0;
		do {
		System.out.println("Escolha e digite o numéro de acordo com a operação matématica que gostaria de fazer:");
		System.out.println("1 - soma\n2 - multiplicacão\n3 - Subtração\n4 - Divisão\n5 - Raiz\n6 - Potência\n7 - Sair ");
		calculos = entrada.nextInt();

		switch (calculos) {
		case 1:
			soma();
			break;
		case 2:
			multiplicacao();
			break;
		case 3:
			subtracao();
			break;
		case 4:
			divisao();
			break;
		case 5:
			raiz();
			break;
		case 6:
			potencia();
			break;
		case 7:
			System.out.println("Saindo...");

		}

		} while (calculos != 7 );
	}

}
