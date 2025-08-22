package lista_exercicios_switch_case_java;

import java.util.Scanner;

public class EstacoesAno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Digite um valor entre 1 e 12: ");
			int mes = scanner.nextInt();
			boolean inverno = true;
			
			switch(mes) {
				case 12, 1, 2:
					System.out.println("Verão");
				break;
				
				case 3, 4, 5:
					System.out.println("Verão");
				break;
				
				case 6,7,8:
					System.out.println("Inverno");
				break;
				
				case 9,10,11:
					System.out.println("Primavera");
				break;
				
				default:
					System.out.println("Digite uma opção correta!");
			}
			if(inverno) {
				System.out.println("Época de chocolate quente!");
			}
		scanner.close();
	}
}