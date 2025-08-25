package lista_exercicios_arraylist_java;

import java.util.ArrayList;

public class SubstituirConvidado {

	public static void main(String[] args) {
		ArrayList<String> listaConvidados = new ArrayList<>();
		
		listaConvidados.add("Beatriz");
		listaConvidados.add("Ana");
		listaConvidados.add("Juliana");
		
		System.out.println("Lista de convidados original: " + listaConvidados);
		String convidadoRemovido = listaConvidados.set(1, "Mariana");
	
		System.out.println("Lista de convidados modificada: " + listaConvidados);
	}
}