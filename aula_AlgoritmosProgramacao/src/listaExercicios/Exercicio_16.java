package listaExercicios;
import java.util.Scanner;
public class Exercicio_16 {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		double inicio,fim;
		
		System.out.println("Digite que horas o jogo iniciou: ");
		inicio = entrada.nextDouble();
		
		System.out.println("Digite que horas o jogo terminou: ");
		fim = entrada.nextDouble();
		
		
		
		if 
		(fim < inicio) {
			System.out.println("O jogo durou: "+(24-inicio + fim)+"horas");
			
		}else if
		(fim>inicio){
			System.out.println("A duração do jogo foi de: "+ (fim-inicio));
		
		}else if
		(inicio == fim) {
			System.out.println("O jogo durou : 24 horas");
		
		}else {
			System.out.println("O jogo ultrapassou seu tempo");
			
			entrada.close();
		}
		
	}
}
