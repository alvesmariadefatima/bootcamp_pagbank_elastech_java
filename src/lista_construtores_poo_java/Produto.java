package lista_construtores_poo_java;

public class Produto {
	String nome;
	double preco;
	int quantidadeEstoque;
	
	public Produto() {
		this("Sem nome", 0.0, 0);
	}
	
	public Produto(String nome) {
		this.nome = nome;
		this.preco = 0.0;
	}
	
	public Produto(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public void exibirDadosProduto() {
		System.out.println("Dados do produto: ");
		System.out.println("\n----------------");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade em estoque: " + quantidadeEstoque);
	}
}