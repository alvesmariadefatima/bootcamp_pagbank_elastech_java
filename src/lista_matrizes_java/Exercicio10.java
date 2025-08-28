package lista_matrizes_java;

import java.util.ArrayList;

public class Exercicio10 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayNumeros = new ArrayList<>();
		
		arrayNumeros.add(40);
		arrayNumeros.add(73);
		arrayNumeros.add(30);
		arrayNumeros.add(60);
		arrayNumeros.add(50);
		
		int contPares = 0;
		
		for(Integer numero: arrayNumeros) {
			System.out.println(numero);
			
			if(numero % 2 == 0) {
				contPares++;
			}
		}
		System.out.println("\nQuantidade de números pares: " + contPares);
	}
}