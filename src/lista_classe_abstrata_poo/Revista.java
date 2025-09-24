package lista_classe_abstrata_poo;

public class Revista extends Produto implements Promocional {
    public Revista(double preco) {
    		super(preco);	
    }
	
	@Override
    public void aplicarDesconto(double valor) {
        preco -= preco * valor / 100;
        if (preco < 0) preco = 0;
        System.out.println("Revista: desconto de " + valor + "% aplicado. Novo preço: R$" + preco);
    }
}