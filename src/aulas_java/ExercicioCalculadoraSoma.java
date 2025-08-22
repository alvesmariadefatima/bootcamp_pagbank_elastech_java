package aulas_java;

import java.util.*;

public class ExercicioCalculadoraSoma {
	public static void main (String args []) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite o valor da segunda nota: ");
		double nota2 = scanner.nextInt();
		
		System.out.println("Digite o valor da terceira nota: ");
		double nota3 = scanner.nextInt();
		
		double media = (nota1 + nota2 + nota3) / 3;
		String textoFormat = String.format("Média do aluno %.2f", media);
		
		System.out.println(textoFormat);
		
		scanner.close();
	}
}