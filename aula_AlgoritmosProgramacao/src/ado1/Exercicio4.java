package ado1;
import java.util.Scanner;
public class Exercicio4 {

	public static void main (String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		double kwh, conta, minimo = 11.50;
		
		System.out.println("Digite a quantidade de kWh que foi consumida: ");
		kwh = entrada .nextDouble();
		
		if 
		(kwh <= 150) {
			conta = kwh * 0.20;
			System.out.println("Voc� consumiu "+ kwh+ " kWh ent�o o valor da sua conta � "+ conta+ "R$");
		}else if 
		(kwh >150 && kwh <500) {
			conta = kwh * 0.25;
			System.out.println("Voc� consumiu "+ kwh+ " kWh ent�o o valor da sua conta � "+ conta+ "R$");
		}else if 
		(kwh> 500) {
			conta = kwh * 0.30;
			System.out.println("Voc� consumiu "+ kwh+ " kWh ent�o o valor da sua conta � "+ conta+ "R$");
				
		}else {
			System.out.println("O valor da sua conta � de "+ minimo + "R$");
			
			entrada.close();
		}
	}
}
