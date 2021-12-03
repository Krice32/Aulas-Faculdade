package ado4;

public class Exercicio1 {
	static String status;

	static void imprimirNota(double nota) {
		if (nota >= 6) {
			status = "Aprovado";
		} else {
			status = "Reprovado";
		}

	}

	public static void main(String[] args) {
		imprimirNota(5.7);
		System.out.println(status);
	}
}
