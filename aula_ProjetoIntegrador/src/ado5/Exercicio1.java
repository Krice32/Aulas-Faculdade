package ado5;
import java.util.Scanner;
public class Exercicio1 {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		int opcoes;
		
		do {
			System.out.println("1- Intru��es\n2- Jogar\n3- Cr�ditos\n4- Sair");
			opcoes = entrada.nextInt();
			
			switch (opcoes) {
			case 1 :
				System.out.println("Estou treinando la�o de repeti��o, sempre que escolher a op��o 1, dever� cair nessa tela\nCaso escolha a op��o 2 vai se deparar com um texto\nop��o 3 vai ver o nome de quem fez o jogo\ne a 4 voc� sai desse la�o\n ");
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
