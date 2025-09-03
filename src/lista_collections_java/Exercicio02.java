package lista_collections_java;

import java.util.Stack;

public class Exercicio02 {

	public static void main(String[] args) {
		String palavra = "Java";
		Stack<Character> inverterPalavra = new Stack<>();
		
		for(int i = 0; i < palavra.length(); i++) {
			inverterPalavra.push(palavra.charAt(i));
		}
		
		String palavraInvertida = "";
		while(!inverterPalavra.isEmpty()) {
			palavraInvertida += inverterPalavra.pop();
		}
		System.out.println("Palavra original: " + palavra);
		System.out.println("Palavra invertida: " + palavraInvertida);
	}
}