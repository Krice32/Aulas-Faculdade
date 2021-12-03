package aulas;
import java.util.Scanner;
public class LacoRepeticaoFor4 {

	public static void main (String [] args ) {
		Scanner entrada = new Scanner (System.in);
		String usuario,user = "Teste123";
		int i,senha, pwd = 123; 
		int cont = 3;
		 for (i = 1; i<=3; i++) {
			 
				System.out.println("Digite seu login : ");
				usuario = entrada.next();
				
				System.out.println("Digite sua senha : ");
				senha = entrada.nextInt();
				
				
			 if (user.equals(usuario) && pwd == senha) {
				 
				 System.out.println("Login e senha corretos !!");
				 break;
			
			 }else {
				 System.out.println("Tente novamente");
				 System.out.println("Restam "+ (cont - i) + " tentativas");
				 
				 entrada.close();
			 }
		 }
	}
}
