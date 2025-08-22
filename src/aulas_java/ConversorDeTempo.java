package aulas_java;

import java.util.Scanner;

public class ConversorDeTempo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor em segundos: ");
		int valorTotalSegundo = scanner.nextInt();
		int minutos = (valorTotalSegundo % 3600) / 60;
		int segundos = valorTotalSegundo % 60;
		
		System.out.println(valorTotalSegundo + " segundos equivalem a: ");
		System.out.println(minutos + " minuto(s) e " + segundos + " segundo(s).");
	
		scanner.close();
	}
}