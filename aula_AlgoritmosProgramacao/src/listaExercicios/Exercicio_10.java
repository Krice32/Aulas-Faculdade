package listaExercicios;
import java.util.Scanner;
public class Exercicio_10 {

	public static void main (String[]args) {
		
		String vendedor;
		double salarioFixo,vendasEfetuadas, comissao;
		Scanner entrada = new Scanner(System.in);
		
	
		
		System.out.println("Digite o nome do Vendedor: ");
		vendedor = entrada.nextLine();
		
		System.out.println("Agora digite seu salário fixo: ");
		salarioFixo = entrada.nextDouble();
		
		System.out.println("Digite o total de vendas efetuadas (em dinheiro) por este vendendor: ");
		vendasEfetuadas = entrada.nextDouble();
		
		comissao = (vendasEfetuadas*0.15) + salarioFixo;
		
		System.out.println(vendedor+" o seu salário com comissão será de : "+ comissao);
		
		entrada.close();
	}
	
}
