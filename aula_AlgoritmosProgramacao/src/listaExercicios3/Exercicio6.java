package listaExercicios3;

import java.util.Scanner;

public class Exercicio6 {

	 static Scanner entrada = new Scanner(System.in);
	    static double maiorRaiz() {
	        int a,b,c,d;
	        int delta;
	        double raizes=0;
	        System.out.println("Digite o primeiro valor");
	        a= entrada.nextInt();
	        System.out.println("Digite o segundo valor");
	        b= entrada.nextInt();
	        System.out.println("Digite o terceiro valor");
	        c= entrada.nextInt();
	        System.out.println("Digite o valor de D, se D = 1 sera exibido a maior raiz, se D = 2 sera exibvido a menor ");
	        d= entrada.nextInt();

	        delta = ((b * b) - (4 * a * c)); 
			double x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a); 
			double x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 

			if ((2*a==0) || (delta < 0)) {
	            
	            return -1;
				
			} else if (d==1) {
	            raizes = x1;
				System.out.println("x1: " +raizes);
			}else if (d==2) {
	            raizes = x2;
	            System.out.println("x2: " +raizes); 
	                  
	        }return raizes;
	    }
	    public static void main(String[] args) {
	        System.out.println("A maior raiz = "+ maiorRaiz());
	    }
	}

