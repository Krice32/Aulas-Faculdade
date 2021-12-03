package listaExercicios3;

import java.util.Scanner;

public class Exercicio5 {

	public static double delta (int a, int b, int c) {
        double delta, x1, x2;
        delta  = Math.pow(b, 2) - (4* a * c);

        if 
        (delta > 0 ) {
            x1 = (-b + Math.sqrt(delta))/(2 * a);
            x2 = (-b - Math.sqrt(delta))/(2 * a);

            if(x1>x2) {return x1; }
            else { return x2;
            }

        }else if
        (delta<=0 || delta == 0) {
         return -1;

        }


        return delta;
    } 

    public static int entradaDados() {

        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        int num;
        num = entrada.nextInt();
       
        return num;
     
    }



    public static void main(String[] args) {
    int a, b, c;

    System.out.print("valor de A: ");
    a = entradaDados();

    System.out.print("valor de B: ");
    b = entradaDados();

    System.out.print("valor de C: ");
    c = entradaDados();


    double bhaskara1 = delta( a,  b,  c) ;

    System.out.println(bhaskara1);

}
}