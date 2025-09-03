package lista_collections_java;

import java.util.Stack;

public class Exercicio03 {

	public static void main(String[] args) {
		Stack<String> pilhaHistorico = new Stack<>();
		
		pilhaHistorico.push("https://www.google.com/search?q=google.com");
		pilhaHistorico.push("oracle.com");
		pilhaHistorico.push("github.com");
		
		System.out.println("Histórico de navegação atual: " + pilhaHistorico);
		System.out.println("Página no topo: " + pilhaHistorico.peek());
		
		String paginaAnterior = pilhaHistorico.pop();
		System.out.println("\nVoltando...Página fechada com sucesso " + paginaAnterior);
		System.out.println("Agora estou em " + pilhaHistorico.peek());
		
		paginaAnterior = pilhaHistorico.pop();
		System.out.println("\nVoltando...página fechada com sucesso: " + paginaAnterior);
		System.out.println("Agora estou em: " + pilhaHistorico.peek());
	}
}