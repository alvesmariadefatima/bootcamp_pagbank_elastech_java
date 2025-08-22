package lista_exercicios_operadores_relacionais_java;

import java.util.Scanner;

public class VerificaAprovacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua nota com um valor: ");
		double nota = sc.nextDouble();
		
		if(nota >= 7.0) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		sc.close();
	}
}
