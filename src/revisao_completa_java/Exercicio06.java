package revisao_completa_java;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int numero = 0;
		
		while(true) {
			System.out.println("Digite um número (0 para sair): ");
			numero = sc.nextInt();
			
		if(numero == 0) {
			break;
		}
		soma += numero;
	}
		
		System.out.println("A soma dos números digitados é: " + soma);
		sc.close();
	}
}