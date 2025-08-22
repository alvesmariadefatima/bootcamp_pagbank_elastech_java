package lista_exercicios_arrays_java;

import java.util.Arrays;

public class Exercicio3 {

	public static void main(String[] args) {
		char[] trocaValores = {'A', 'B'};
		System.out.println("Array original: " + Arrays.toString(trocaValores));
		
		char aux = trocaValores[0];
		trocaValores[0] = trocaValores[1];
		trocaValores[1] = aux;

		System.out.println("Array modificado após a troca: " + Arrays.toString(trocaValores));
	}
}