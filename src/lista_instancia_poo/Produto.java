package lista_instancia_poo;

public class Produto {
	private double preco;
	
	public void setPreco(double p) {
		this.preco = p;
	}
	
	public double getPreco() {
		return this.preco;
	}
	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.setPreco(150.00);
		
		System.out.println("Preço do produto: R$ " + p1.getPreco());
	}
}