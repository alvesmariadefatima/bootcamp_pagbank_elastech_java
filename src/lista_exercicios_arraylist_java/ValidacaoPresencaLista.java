package lista_exercicios_arraylist_java;

import java.util.ArrayList;

public class ValidacaoPresencaLista {

	public static void main(String[] args) {
		ArrayList<String> validarListaPresenca = new ArrayList<>();
		
		validarListaPresenca.add("Alice");
		validarListaPresenca.add("Fernanda");
		validarListaPresenca.add("Camila");
		
		boolean contemCamila = validarListaPresenca.contains("Camila");
		boolean contemBarbara = validarListaPresenca.contains("Barbara");

		System.out.println("A lista contém Camila? " + contemCamila);
		System.out.println("A lista contém Barbara? " + contemBarbara);
	}
}