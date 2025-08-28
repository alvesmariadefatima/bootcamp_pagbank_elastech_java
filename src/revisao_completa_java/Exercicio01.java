package revisao_completa_java;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nome = sc.next();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("Meu nome completo é " + nome + ", tenho " + idade + " anos e minha altura é " + altura);
	
		sc.close();
	}
}