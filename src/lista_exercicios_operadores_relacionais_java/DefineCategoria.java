package lista_exercicios_operadores_relacionais_java;

import java.util.Scanner;

public class DefineCategoria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		if(idade >= 0 && idade <= 12) {
			System.out.println("Criança");
		} else if (idade >= 13 && idade <= 17) {
			System.out.println("Adolescente");
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("Adulto");
		} else if (idade >= 60) {
			System.out.println("Idoso");
		} else {
			System.out.println("Idade inválida!");
		}
		scan.close();
	}
}
