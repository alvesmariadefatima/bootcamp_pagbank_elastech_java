package atividade_revisao_poo_java;

public class Livro {
	String titulo;
	String autor;
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	public static void main(String[] args) {
		Livro l1 = new Livro("O Diário de Anne Frank", "Anne Frank");
		Livro l2 = new Livro("A Culpa é das Estrelas", "John Green");
		
		System.out.println("Nome do livro: " + l1.titulo);
		System.out.println("Autor(a): " + l1.autor);
		System.out.println("Nome do livro: " + l2.titulo);
		System.out.println("Autor(a): " + l2.autor);
	}
}