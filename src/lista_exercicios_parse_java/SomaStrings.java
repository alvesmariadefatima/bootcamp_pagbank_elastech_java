package lista_exercicios_parse_java;

import java.util.*;

public class SomaStrings {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		String valor1 = leitor.next();
		
		System.out.println("Digite o valor 2: ");
		String valor2 = leitor.next();		
		
		int valor1Int = Integer.parseInt(valor1);
		int valor2Int = Integer.parseInt(valor2);
				
		System.out.println("Soma dos valores: " + (valor1Int + valor2Int));
		leitor.close();
	}
}
