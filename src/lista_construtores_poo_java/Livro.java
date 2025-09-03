package lista_construtores_poo_java;

public class Livro {
	String titulo;
	String autor;
	
	public Livro() {
		this("Livro 1", "Desconhecido");
	}
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public void exibeDadosLivro() {
		System.out.println("Dados do livro: ");
		System.out.println("\n--------------");
		System.out.println("Nome do livro: " + titulo);
		System.out.println("Autor(a): " + autor);
	}
}