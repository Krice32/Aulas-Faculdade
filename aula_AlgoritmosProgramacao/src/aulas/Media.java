package aulas;
import java.util.Scanner;
public class Media {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		float n1,n2,media, notasub,novamedia;
		int faltas,nota;
	
		
		
		System.out.println("C�lculo de m�dia ");
		System.out.println("Digite sua 1� nota: ");
		n1 = entrada.nextFloat();
		System.out.println("Digite sua 2� nota: ");
		n2 = entrada.nextFloat();
		System.out.println("Digite quantas faltas voc� tem :");
		faltas=entrada.nextInt();
		
		
		media = (n1+n2)/2;
		
		if 
		(media >= 6 && faltas <=18) {
			System.out.println("A m�dia do aluno foi "+media+" e teve "+ faltas+ "faltas\nO aluno est� aprovado ");
			
			
			
			}else if
			(faltas >=18) {
				System.out.println("O n�mero de faltas do aluno foi " + faltas+"\nO aluno est� reprovado");
				
			}else if 
			((media <6) && (faltas >=18)) {
				System.out.println(" A m�dia do aluno foi"+media+"e teve"+faltas+"\nO aluno est� reprovado");
				
		
				
			
		}else if 
		(media <6) {
			System.out.println("A m�dia do aluno foi " + media + "\nGostaria de fazer uma prova para substituir sua nota");
			System.out.println("Digite 1 para SIM e 2 para N�O");
			nota = entrada.nextInt();
		
			switch(nota) {
			
			case 1 :
				System.out.println("Digite sua nova nota");
				notasub=entrada.nextFloat();
				novamedia = (notasub+media)/2;
				if
				(notasub >media && notasub>6);
					System.out.println("O aluno est� aprovado e sua m�dia �: "+ novamedia);
			case 2 :
				System.out.println("O aluno n�o quis fazer a prova substitutiva e est� reprovado");
			
			}
			
		entrada.close();

		}
		
	}
}
		
		
	
		
		
		
	
