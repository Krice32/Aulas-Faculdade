package ado5;
import java.util.Scanner;
public class Exercicio1 {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		int opcoes;
		
		do {
			System.out.println("1- Intruções\n2- Jogar\n3- Créditos\n4- Sair");
			opcoes = entrada.nextInt();
			
			switch (opcoes) {
			case 1 :
				System.out.println("Estou treinando laço de repetição, sempre que escolher a opção 1, deverá cair nessa tela\nCaso escolha a opção 2 vai se deparar com um texto\nopção 3 vai ver o nome de quem fez o jogo\ne a 4 você sai desse laço\n ");
			break;
			
			case 2 : 
				System.out.println("O JOGO\n");
				break;
				
			case 3 : 
				System.out.println("Menu feito por Erick Santos Rocha\n");
				break;
				
			case 4 : 
				System.out.println("Saindo...");
				
				break;
			}

		
		}while (opcoes  !=4);
		
		entrada.close();
		
		
	}
}
