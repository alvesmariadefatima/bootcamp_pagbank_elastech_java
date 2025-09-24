package lista_classe_abstrata_poo;

public class Livro extends Produto implements Promocional {
	public Livro(double preco) {
		super(preco);
	}
	
    @Override
    public void aplicarDesconto(double valor) {
        preco -= valor;
        if (preco < 0) preco = 0;
        System.out.println("Livro: desconto de R$" + valor + " aplicado. Novo preço: R$" + preco);
    }
}