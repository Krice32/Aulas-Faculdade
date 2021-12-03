package ado8;
import java.util.Random;
import java.util.Scanner;
public class Exemplo {




	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int porcentagem = 0, soma = 0;

	        Random gerador = new Random();

	        for (int i = 6; i < 1000000; i++) {
	            System.out.println(gerador.nextInt());

	        }
	        porcentagem = 1000000 / 100;
	        System.out.println(" A porcentagem é: " + porcentagem + " Vezes ");
	        soma = 10000 * 10;
	        System.out.println(" A soma é :" + soma);


	        input.close();
	        gerador.ints();
	    }

	}

