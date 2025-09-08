package lista_construtores_poo_java;

public class PrincipalLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Livro 1", "Autor 1");
		Livro livro2 = new Livro("Livro 2", "Autor 2");
		
		livro1.exibeDadosLivro();
		livro2.exibeDadosLivro();
	}
}