package listaExercicios;
import java.util.Scanner;
public class Exercicio_09 {

	public static void main(String[]args) {
		Scanner entrada = new Scanner (System.in);
		
		int horas, cadastro;
		double valorRecebido,salario;
		
		System.out.println("Digite seu número de cadastro: ");
		cadastro=entrada.nextInt();
		
		System.out.println("Agora digite o seu número de horas trabalhadas : ");
		horas = entrada.nextInt();
		
		System.out.println("Quanto você recebe por hora ? ");
		valorRecebido = entrada.nextDouble();
		
		salario = valorRecebido*horas;
		
		System.out.println("Funcionário "+cadastro+  " seu salário é de "+ salario);
		
		entrada.close();
		
	}
}
