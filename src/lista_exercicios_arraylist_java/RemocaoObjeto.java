package lista_exercicios_arraylist_java;

import java.util.ArrayList;

public class RemocaoObjeto {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		
		System.out.println("Tamanho da lista: " + numeros.size());
		
		numeros.remove(Integer.valueOf(20));
		
		System.out.println(numeros);
	}
}