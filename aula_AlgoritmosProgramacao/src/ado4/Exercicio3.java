package ado4;

public class Exercicio3 {
	static String parImpar;

	static void parOuImpar(int x) {

		if (x % 2 == 0) {
			parImpar = "par";

		} else {
			parImpar = "Impar";

		}
		

	}

	public static void main(String[] args) {
		parOuImpar(10);

		System.out.println(parImpar);

	}
}
