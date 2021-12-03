package ado8;

public class Exercicio1 {

	public static void main(String args[]) {

		int dado, lancamento = 0;
		int[] salvar = new int[6];

		for (int i = 0; i < 1000000; i++) {
			lancamento++;
			System.out.println(lancamento + "º Lançamento do dado");
			dado = (int) (Math.random() * 6);
			salvar[dado]++;
			System.out.println("Face: " + (dado + 1));
		}

		for (int i = 0; i < salvar.length; i++) {

			System.out.println("posição" + (i + 1) + " " + (salvar[i] * 100) / 1000000d + "%");

		}

	}
}
