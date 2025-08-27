package revisao_completa_java;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[5];
		int soma = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			numeros[i] = teclado.nextInt();
			soma += numeros[i];
		}
			
		System.out.println("\nNúmeros digitados: ");
		for (int num : numeros) {
			System.out.println(num);
		}
		
		System.out.println("\nSoma total: " + soma);
		teclado.close();
	}
}