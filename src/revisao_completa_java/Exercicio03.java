package revisao_completa_java;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();
			
			if(idade >= 18) {
				System.out.println("Você é maior de idade");
			} else {
				System.out.println("Você é menor de idade");
			}
			
		sc.close();
	}
}