package lista_classe_abstrata_poo;

public abstract class Produto {
	private String nome;
	protected double preco;
	
	public Produto(double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public abstract void aplicarDesconto(double porcentagem);

	public static void main(String[] args) {
		Vestuario v = new Vestuario();
		Eletronico e = new Eletronico();
		
		v.aplicarDesconto();
		e.aplicarDesconto();
	}
}