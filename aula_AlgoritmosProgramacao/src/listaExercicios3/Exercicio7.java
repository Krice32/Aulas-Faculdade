package listaExercicios3;

import java.util.Scanner;

public class Exercicio7 {
	static float volume (float raio) {
        float pi = (float) 3.14;
        float v = (float) (4 * (pi * Math.pow(raio, 3 )/3));
        return v;

    } 

    public static double entradaDados() {

        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Insira o numero");
        num = entrada.nextInt();
        return num;

    }


    public static void main(String[] args) {

        float raio, resultado;

        System.out.println("Insira o valor do raio para calcular seu volume");
        raio = (float) entradaDados();

        resultado = volume(raio);
        System.out.println(resultado);

    }

}

