package lista_exercicios_arrays_java;

import java.util.Arrays;

public class Exercicio5 {

	public static void main(String[] args) {
		int[] arrayOriginal = {5, 10, 15};
		
		int[] arrayCopia = new int[3];
		
		arrayCopia[0] = arrayOriginal[0];
		arrayCopia[1] = arrayOriginal[1];
		arrayCopia[2] = arrayOriginal[2];
		
		System.out.println("Array cópia: " + Arrays.toString(arrayCopia));
	}
}