package lista_encapsulamento_java;

public class Produto {
	private String nome;
	private double preco;
	private int estoque;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public double setPreco(double valor) {
		if(valor > 0) {
			this.preco = valor;
			System.out.println("Preço: R$ " + preco);
		} else {
			System.out.println("Preço inválido!!!");
		}
		return valor;
	}
	
	public int setEstoque(int quantidade) {
		if(quantidade >= 0) {
			this.estoque = quantidade;
			System.out.println("Quantidade de estoque: " + estoque);
		} else {
			System.out.println("Quantidade inválida!!!");
		}
		return estoque;
	}
	
	public double getValorTotalEmEstoque() {
		return preco * estoque;
	}
	
	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.setNome("Sabonete");
		System.out.println("Produto: " + p1.getNome());
		
		p1.setPreco(4.50);
		p1.setPreco(-7.00);
		p1.setEstoque(100);
		p1.setEstoque(-50);
		
		System.out.println("Valor total em estoque: R$ " + p1.getValorTotalEmEstoque());
	}
}