package aula_algoritmol;
import java.util.Scanner;
public class LoginRepeticao {

	public static void main (String []args) {
		
		String user = "John";
		String password = "12345678";
		String login,senha;
		Scanner entrada = new Scanner(System.in);
		boolean tacerto = false;
		
		
		
		do {
		System.out.println("Login: ");
		login = entrada.next();
		System.out.println("Senha: ");
		senha = entrada.next();
		
		if (login.equalsIgnoreCase(user) && (senha.equals(password))) {
		tacerto = true;
		
		}else if
		(login.equalsIgnoreCase(user) && !senha.equals(password)){
		System.out.println("Senha incorreta");
		
		}else if
		(!login.equalsIgnoreCase(user) && senha.equals(password)){
		System.out.println("Login incorreto");
		
		}else 
		System.out.println("Login e senha incorretos");
		}while (!tacerto);
		
		System.out.println("Login e senha corretos");
		
		entrada.close();
	}
}
