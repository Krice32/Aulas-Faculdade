package aulas;

import java.util.Scanner;

/*1 - tamanhoVetor() - Obter o tamanho do vetor
 *2 - criaVetor() - instanciar o vetor com base no tamanho (1)
 *3 - popularVetor() - preencher o vetor com os elementos do usuário
 *4 - operacaoMaiorMenorSoma() - operação (lógica) para encontrar o maior
 *5 - imprimirDados() - imprimir os valores encontrados
 * 
 */
public class VetorFuncao {

	static int tamanhoVetor() {
		System.out.println("*-- Tamanho Vetor --*");
		Scanner entrada = new Scanner (System.in);
		System.out.println("Tamanho: ");
		int tamanho = entrada.nextInt();
		return tamanho;
	}
	
	static int[] criarVetor(int tamanho){
		System.out.println("*-- Criar vetor --*");
		int [] vetor = new int[tamanho];
		return vetor; //vetor com zeros <default>
	}
	
	static int[] populaVetor(int[]vetor) {
		System.out.println("*--Pupula Vetor --*");
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
		System.out.printf("vetor [%d] = ", i);
		System.out.println("\n");
		}
		return vetor;
	}
	
	static int [] maiorMenorSoma(int [] vetor){
		
		System.out.println("*-- Maior / Menor / Soma --*");
		int [] vetorResultado = new int [3];
		int soma = 0;
		int maior = vetor[0];
		int menor = vetor [0];
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
			
			if (vetor[i]< menor) {
				menor = vetor[i];
			}
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			
		}
		
		vetorResultado [0] = maior ;
		vetorResultado [1] = menor ;
		vetorResultado [2] = soma ;
		
		return vetorResultado;
		
	}
	
	static void imprimirDados(int[]vR) {
		System.out.println("*-- Imprimir Dados --*");
		System.out.printf("Maior %d \nMenor%d \nSoma: %d\n", vR[0], vR[1], vR[2]);
		
	}
	public static void main (String[]args) {
		int t = tamanhoVetor();
		int [] v = criarVetor(t);
		v = populaVetor(v);
		int []vR = maiorMenorSoma(v);
		imprimirDados(vR);
		
	}
}
