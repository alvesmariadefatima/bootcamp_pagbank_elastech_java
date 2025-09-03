package lista_collections_java;

import java.util.Stack;

public class Exercicio04 {

	public static void main(String[] args) {
		Stack<Integer> pilhaPratos = new Stack<>();
		
		pilhaPratos.push(10);
		pilhaPratos.push(20);
		pilhaPratos.push(30);
		pilhaPratos.push(40);
		pilhaPratos.push(50);
		
		System.out.println("Retirada de prato: " + pilhaPratos.pop());
		System.out.println("Retirada de prato: " + pilhaPratos.pop());
		System.out.println("Próximo prato no topo: " + pilhaPratos.peek());
	}
}