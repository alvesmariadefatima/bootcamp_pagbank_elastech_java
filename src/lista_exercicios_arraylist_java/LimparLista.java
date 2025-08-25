package lista_exercicios_arraylist_java;

import java.util.ArrayList;

public class LimparLista {

	public static void main(String[] args) {
		ArrayList<Double> listaValores = new ArrayList<>();
		
		listaValores.add(20.0);
		listaValores.add(60.0);
		listaValores.add(100.0);
		listaValores.add(500.70);
		
		boolean  listaVaziaAntes = listaValores.isEmpty();
		
		listaValores.clear();
		
		boolean listaVaziaDepois = listaValores.isEmpty();

		
		System.out.println("Lista vazia antes de limpar? " + listaVaziaAntes);
		System.out.println("Lista vazia depois de limpar? " + listaVaziaDepois);
	}
}