package listaExercicios;
import java.util.Scanner;
public class Exercicio_09 {

	public static void main(String[]args) {
		Scanner entrada = new Scanner (System.in);
		
		int horas, cadastro;
		double valorRecebido,salario;
		
		System.out.println("Digite seu n�mero de cadastro: ");
		cadastro=entrada.nextInt();
		
		System.out.println("Agora digite o seu n�mero de horas trabalhadas : ");
		horas = entrada.nextInt();
		
		System.out.println("Quanto voc� recebe por hora ? ");
		valorRecebido = entrada.nextDouble();
		
		salario = valorRecebido*horas;
		
		System.out.println("Funcion�rio "+cadastro+  " seu sal�rio � de "+ salario);
		
		entrada.close();
		
	}
}
