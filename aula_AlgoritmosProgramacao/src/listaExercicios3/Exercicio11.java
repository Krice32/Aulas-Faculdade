package listaExercicios3;

import java.util.Scanner;

public class Exercicio11 {

	public static double entradaDados() {

        Scanner entrada = new Scanner(System.in);
        double nota;
        System.out.println("Digite sua nota :");
        nota = entrada.nextDouble();
        entrada.close();
        return nota;

    }

    static char conceito(double nota) {

        double x =entradaDados();

        if (x >= 0 && x <= 4.9) {
            return 'D';

        } else if (x >= 5.0 && x <= 6.9) {
            return 'C';

        } else if (x >= 7.0 && x <= 8.9) {
            return 'B';

        } else if (x >= 9.0 && x <= 10.0) {
            return 'A';
        } else {
            return 0 ;
        }

    }
    public static void main (String[]args) {
        System.out.println(conceito(0));
    }
}