package aulas_java;
import java.util.Scanner;

public class CalculadoraSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numeroA = sc.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		int numeroB = sc.nextInt();
		
		int soma = numeroA + numeroB;
		
		System.out.println("A soma de " + numeroA + " + " + numeroB + " é igual a " + soma);
		
		sc.close();
	}

}
