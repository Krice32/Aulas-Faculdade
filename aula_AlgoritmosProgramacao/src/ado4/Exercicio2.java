package ado4;

public class Exercicio2 {

	static int numeroMaior(int x, int y) {
		x = 0;
		if (x > y) {
			return x;
		} else {
			return y;
		}

	}

	public static void main(String[] args) {
		int x = 6;
		int y = 10;
		int z = numeroMaior(x, y);

		System.out.println(z);
	}
}
