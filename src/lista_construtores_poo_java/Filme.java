package lista_construtores_poo_java;

public class Filme {
	private String titulo;
	private String diretor;
	private int anoLancamento;
	
	public Filme(String titulo, String diretor, int anoLancamento) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.anoLancamento = anoLancamento;
	}
	
	public void mostrarDetalhes() {
		System.out.println("Dados do filme: ");
		System.out.println("\n--------------");
		System.out.println("Nome: " + titulo);
		System.out.println("Diretor: " + diretor);
		System.out.println("Ano de lançamento: " + anoLancamento);
	}
}