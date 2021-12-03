package ado7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Exercicio1 {

	public static void main (String[]args) {
		

	        Scanner entrada = new Scanner(System.in);
	    
	    
	        String resposta;
	        int tentativas = 0;
	        boolean sair = true;
	        
	        ArrayList <String> alternativas = new ArrayList<String>();
	        String opcao1 = "1101 0111 0000 0010 1010";
	        String opcao2 = "1110 1001 0000 0011 1101";
	        String opcao3 = "1111 1001 0000 0011 1011";
	        String opcao4 = "1111 1001 0000 0010 1011";
	        String opcao5 = "1111 1010 0000 0101 1011";

	        do {
	        	
	          	Collections.shuffle(alternativas);
	           	Collections.shuffle(alternativas);
	           	Collections.shuffle(alternativas);
	           	
	        	alternativas.add(opcao1);
	        	alternativas.add(opcao2);
	        	alternativas.add(opcao3);
	        	alternativas.add(opcao4);
	        	alternativas.add(opcao5);
	        	
	        
	        	
	            tentativas++;

	            System.out.println("\n\n - CONVERTA OS ALGORITMOS PARA BINÁRIO");
	            System.out.println(
	                    "Qual destas opções é equivalente ao resultado da conversão de hexadecimal para binário\nNúmero: F902B ");
	        
	           

	         
	            
	            for (int i = 0; i < alternativas.size(); i++) {
	                switch (i) {
	                    case 0:
	                        System.out.println("A - " + alternativas.get(i));
	                        break;
	                    case 1:
	                        System.out.println("B - " + alternativas.get(i));
	                        break;
	                    case 2:
	                        System.out.println("C - " + alternativas.get(i));
	                        break;
	                    case 3:
	                        System.out.println("D - " + alternativas.get(i));
	                        break;
	                    case 4:
	                        System.out.println("E - " + alternativas.get(i));
	                        break;
	                }
	              
	            }
	            System.out.print("\nResposta : ");
	            
	            resposta = entrada.next();
	            int index = 0;

	            switch (resposta.toLowerCase()) {

	                case "a":
	                    index = 0;
	                    break;
	                case "b":
	                    index = 1;
	                    break;
	                case "c":
	                    index = 2;
	                    break;
	                case "d":
	                    index = 3;
	                    break;
	                case "e":
	                    index = 4;
	                    break;
	            }
	            if(alternativas.get(index).equals("1111 1001 0000 0010 1011")){
	                System.out.println("Resposta Correta  na tentativa :" + tentativas);
	                sair = false;
	                
	             }else{
	                 System.out.println("Resposta incorreta");
	             }

	
	      
	        	
	   
	        } while (sair);

	     
	        entrada.close();
	    }
	}