package lista_collections_java;

import java.util.Stack;

public class Exercicio01 {

	public static void main(String[] args) {
		Stack<String> empilharLivros = new Stack<>();
		
		empilharLivros.push("O Senhor dos Anéis");
		empilharLivros.push("O Hobbit");
		empilharLivros.push("O Sulmarillion");
		
		while(!empilharLivros.isEmpty()) {
			System.out.println("Livro retirado: " + empilharLivros.pop());
		}
	}
}