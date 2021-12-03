package listaExercicios2;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		String password = "2002";
		String senha;
		Scanner entrada = new Scanner(System.in);
		boolean tacerto = false;

		do {

			System.out.println("Senha: ");
			senha = entrada.next();

			if ((senha.equals(password))) {
				tacerto = true;

			} else if (!senha.equals(password))
				System.out.println("Senha incorreta");

		} while (!tacerto);

		System.out.println("Acesso permitido ");

		entrada.close();
	}
}
