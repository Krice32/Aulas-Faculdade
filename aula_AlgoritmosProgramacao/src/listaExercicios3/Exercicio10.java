package listaExercicios3;

import java.util.Scanner;

public class Exercicio10 {
	static int idadeNadador(int idade) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("idade : ");
		idade = entrada.nextInt();
		entrada.close();
		return idade;

	}

	static String categoria() {

		int idade = idadeNadador(0);

		if (idade >= 5 && idade <= 7) {
			return "Infantil A";

		} else if (idade >= 8 && idade <= 10) {
			return "Infatil B";

		} else if (idade >= 11 && idade <= 13) {
			return "Juvenil A";

		} else if (idade >= 14 && idade <= 17) {
			return "Juvenil B";

		} else if (idade >= 18) {
			return "Adulto";
		}
		return null;
	
	}

	public static void main(String[] args) {

	
		System.out.print("Categoria : " + categoria());
	}
}
