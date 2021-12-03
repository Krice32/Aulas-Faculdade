package aulas;

import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int hora, min, seg, continuar;
		int horaA = 0, minA = 0, segA = 0;

		do {
		
		System.out.println("###Despertador###");
		System.out.println("Ajuste o horário para despertar");
		do {
			System.out.print("Hora : ");
			horaA = entrada.nextInt();
			if (horaA < 0 || horaA > 23) {
				System.out.println("Valor inválido, tente de novo");
			}
		} while (horaA < 0 || horaA > 23);

		do {
			System.out.print("minuto : ");
			minA = entrada.nextInt();
			if (minA < 0 || minA > 59) {
				System.out.println("Valor inválido, tente de novo");

			}
		} while (minA < 0 || minA > 59);

		do {
			System.out.print("segundos : ");
			segA = entrada.nextInt();
			if (segA < 0 || segA > 59) {
				System.out.println("Valor inválido, tente de novo");
			}
		} while (segA < 0 || segA > 59);

		for (hora = 0; hora < 24; hora++) {
			for (min = 0; min <= 59; min++) {
				for (seg = 0; seg <= 59; seg++) {
					System.out.printf("%d: %d: %d: \n", hora, min, seg);

					if (hora == horaA && min == minA && seg == segA) {
						System.out.println("ALARME !!");
						break;

					}
				}
				if (hora == horaA && min == minA) {
					break;
				}
			}
			if (hora == horaA) {
				break;
			}
		}
		System.out.println("Deseja continuar ?\n1-Sim\n2-Não");
		continuar = entrada.nextInt();
			
	}while(continuar !=2);
}
}