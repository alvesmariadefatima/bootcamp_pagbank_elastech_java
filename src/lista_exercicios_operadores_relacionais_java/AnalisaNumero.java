package lista_exercicios_operadores_relacionais_java;

import java.util.Scanner;

public class AnalisaNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número positivo, negativo ou zero: ");
		int numero = scan.nextInt();
		
		if(numero >= 1) {
			System.out.println("Positivo");
		} else if (numero < 0 ){
			System.out.println("Negativo");
		} else {
			System.out.println("Zero");
		}
		scan.close();
	}
}