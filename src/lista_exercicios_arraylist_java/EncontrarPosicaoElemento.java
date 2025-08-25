package lista_exercicios_arraylist_java;

import java.util.ArrayList;

public class EncontrarPosicaoElemento {

	public static void main(String[] args) {
		ArrayList<String> estacoesDoAno = new ArrayList<>();
		
		estacoesDoAno.add("Primavera");
		estacoesDoAno.add("Verão");
		estacoesDoAno.add("Outono");
		estacoesDoAno.add("Inverno");
		
		int posicaoOutono = estacoesDoAno.indexOf("Outono");
		int posicaoGeada = estacoesDoAno.indexOf("Geada");
		
		System.out.println("Lista das estações do ano: " + estacoesDoAno);
		System.out.println("Posição de 'Outono': " + posicaoOutono);
		System.out.println("Posição de 'Geada': " + posicaoGeada);
	}
}