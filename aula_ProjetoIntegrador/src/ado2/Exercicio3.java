package ado2;
import java.util.Scanner;
public class Exercicio3 {

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int valor, soma1,soma2,soma3,soma4,soma5,soma6,soma7,soma8,soma9,soma10;
		
		System.out.println("###CALCULADORA###");
		System.out.println("Digite um número que será múltiplicado até 10:");
		valor=entrada.nextInt();
		
		soma1= valor*1;
		soma2= valor*2;
		soma3= valor*3;
		soma4= valor*4;
		soma5= valor*5;
		soma6= valor*6;
		soma7= valor*7;
		soma8= valor*8;
		soma9= valor*9;
		soma10= valor*10;
		
		System.out.println(
				 valor+"x1 ="+soma1+"\n"
				+valor+"x2 ="+soma2+"\n"
				+valor+"x3 ="+soma3+"\n"
				+valor+"x4 ="+soma4+"\n"
				+valor+"x5 ="+soma5+"\n"
				+valor+"x6 ="+soma6+"\n"
				+valor+"x7 ="+soma7+"\n"
				+valor+"x8 ="+soma8+"\n"
				+valor+"x9 ="+soma9+"\n"
				+valor+"x10 ="+soma10+"\n");
		
	entrada.close();
	}
}
