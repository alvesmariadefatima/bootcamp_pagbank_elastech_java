package atividade_loops_java_lista_exercicios;

import java.util.Scanner;

public class SomarNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int soma = 0;
		
		do {
			System.out.println("Digite um número (0 para sair): ");
			numero = scan.nextInt();
			soma += numero;
		} while (numero != 0);
			System.out.println("Soma final = " + soma);
		scan.close();
	}
}
