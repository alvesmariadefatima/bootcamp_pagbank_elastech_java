package lista_exercicios_switch_case_java;

import java.util.Scanner;

public class CardapioOpcoesVegetarianas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Cardápio ===");
		System.out.println("1 - Hambúrguer");
		System.out.println("2 - Pizza");
		System.out.println("3 - Salada");

		System.out.println("Digite uma opção: ");
		int opcaoBotao = sc.nextInt();
		
		switch (opcaoBotao) {
			case 1:
				System.out.println("Você escolheu hambúrguer");
				break;
			
			case 2:
				System.out.println("Deseja a opção vegetariana? (s/n)");
				char vegetariana = sc.next().toLowerCase().charAt(0);
				
				if (vegetariana == 's') {
					System.out.println("Você escolheu pizza vegetariana.");
				} else {
					System.out.println("Você escolheu a pizza tradicional.");
				}
				break;
			
			case 3:
				System.out.println("Você escolheu salada.");
				break;
			
			default:
				System.out.println("Opção inválida!");
		}
		sc.close();
	}
}