package lista_exercicios_switch_case_java;

import java.util.Scanner;

public class SistemaNotasConceito {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma nota de 0 a 10: ");
		int nota = scan.nextInt();
		
		switch (nota) {
			case 10:
			case 9:
			case 8:
				System.out.println("Aprovado com nota, parabéns!");
				break;
				
			case 7:
			case 6:
				System.out.println("Recuperação");
			break;
			
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("Reprovado");
			break;
			
			default:
				System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
		}
		scan.close();
	}
}
