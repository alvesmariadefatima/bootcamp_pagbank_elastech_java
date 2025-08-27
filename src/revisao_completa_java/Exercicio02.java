package revisao_completa_java;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = scan.nextInt();
		
		System.out.println("Soma: " + (valor1 + valor2));
		System.out.println("Subtração: " + (valor1 - valor2));
		System.out.println("Multiplicação: " + (valor1 * valor2));
		System.out.println("Divisão: " + (valor1 / valor2));
		
		scan.close();
	}
}
