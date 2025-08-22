package atividade_loops_java_lista_exercicios;

import java.util.Scanner;

public class ValidacaoEntrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		
		do {
			System.out.println("Digite sua idade (0 a 100): ");
			idade = sc.nextInt();
			
			if(idade < 0 || idade > 100) {
				System.out.println("Idade inválida! Tente novamente.");
			}
		} while (idade < 0 || idade > 100);
			System.out.println("Idade válida: " + idade);
			
			sc.close();
		}
	}