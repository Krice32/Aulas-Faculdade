package ado6;
import java.util.Scanner;


public class Exercicio1 {

	public static void main (String[]args) {
		

	        Scanner entrada = new Scanner(System.in);
	     
	        String opcoes = null;
	        String correta = "d";
	        int resultado;
	        int chances = 3;
	        int tentativas = 0;

	        do {
	       

	            tentativas++;

	            System.out.println("\n\n - CONVERTA OS ALGORITMOS PARA BINÁRIO");
	            System.out.println(
	                    "Qual destas opções é equivalente ao resultado da conversão de hexadecimal para binário\nNúmero: F902B ");
	            System.out.println(
	                    "A) 1101 0111 0000 0010 1010\nB) 1110 1001 0000 0011 1101\nC) 1111 1001 0000 0011 1011\nD) 1111 1001 0000 0010 1011\nE) 1111 1010 0000 0101 1011");
	            System.out.print("\nReposta: ");
	            opcoes = entrada.next();

	            switch (opcoes) {

	            case "a":
	            case "A":
	                System.out.println("resposta incorreta, você tem mais :" + (chances - tentativas) + " chances");
	                break;

	            case "b":
	            case "B":
	                System.out.println("resposta incorreta, você tem mais :" + (chances - tentativas) + " chances");
	                break;

	            case "c": 
	            case "C":
	                System.out.println("resposta incorreta, você tem mais :" + (chances - tentativas) + " chances");
	                break;

	            case "d": 
	            case "D":
	            	
	                System.out.println("resposta correta na tentativa :" + tentativas);
	                break;

	            case "e":
	            case "E":
	                System.out.println("resposta incorreta, você tem mais :" + (chances - tentativas) + " chances");
	                break;
	                
	            } 
	          
	      
	        	
	            resultado = opcoes.compareToIgnoreCase(correta);

	        } while (resultado != 0 && tentativas < 3);

	        System.out.println("Você usou todas as tentativas!");
	        entrada.close();
	    }
	}