package atividade_loops_java_lista_exercicios;

import java.util.Scanner;

public class TabuadaPersonalizada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		System.out.println("Tabuada do " + numero + ":");
		for (int i = 0; i < 11; i++) {
			int valorTabuada = numero *i;
			System.out.println(numero + " x " + i + " = " + valorTabuada);
		}
		sc.close();
	}
}