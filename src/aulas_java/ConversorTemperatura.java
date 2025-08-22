package aulas_java;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double fahrenheit = scanner.nextDouble();
		
		double celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println("Temperatura em ºC: " + celsius + " ºC");
		scanner.close();
	}
}