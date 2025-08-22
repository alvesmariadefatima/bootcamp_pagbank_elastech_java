package lista_exercicios_arrays_java;

import java.util.Arrays;

public class Exercicio2 {

	public static void main(String[] args) {
		int[] numeros = {10, 20, 30, 40, 50};
		System.out.println("Array original: " + Arrays.toString(numeros));
		
		numeros[2] = 99;
		
		System.out.println("Array modificado: " + Arrays.toString(numeros));
	}
}