package lista_exercicios_switch_case_java;

import java.util.Scanner;

public class OperacoesBancarias {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double saldo = 500.0;
		
		System.out.println("== SELECIONE A OPERAÇÃO DESEJADA ===");
		System.out.println("S - SAQUE");
		System.out.println("D - DEPÓSITO");
		
		System.out.println("Por favor, digite a opção desejada: ");
		char opcaoDesejada = sc.next().toLowerCase().charAt(0);
		
		switch(opcaoDesejada) {
			case 's':
				System.out.println("Digite o valor do saque: ");
				double valorSaque = sc.nextDouble();
				
				if (valorSaque <= saldo) {
					saldo -= valorSaque;
					System.out.println("Saque realizado com sucesso!");
					System.out.println("Saldo atual: R$ " + saldo);
				} else {
					System.out.println("Saldo insuficiente para realizar o saque!");
				}
			break;
			
			case 'd':
				System.out.println("Digite o valor do depósito: ");
				double valorDeposito = sc.nextDouble();
				
				saldo += valorDeposito;
				
				System.out.println("Depósito realizado com sucesso");
				System.out.println("Saldo atual: R$ " + saldo);
			break;
			
			default:
				System.out.println("Opção inválida. Tente novamente!");
		}
		sc.close();
	}
}
