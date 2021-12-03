package listaExercicios3;

import java.util.Scanner;

public class Exercicio12 {

	static double entradaDados() {
		Scanner entrada = new Scanner(System.in);
		
		double alt, resultado = 0;
		int sexo;

		System.out.print("altura : ");
		alt = entrada.nextDouble();
		System.out.print("sexo 1 -[F] Feminino ou 2- [M] Masculino : ");
		sexo = entrada.nextInt();
		entrada.close();
		if (sexo == 1) {
			resultado = (62.1 * alt - 44.7);

		} else if (sexo == 2) {
			resultado = (72.7 * alt - 58);

		}

		return resultado;

	}

	public static void main(String[] agrs) {

		System.out.println("Peso ideal é "+entradaDados());
	}
}
