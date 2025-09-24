package lista_classe_abstrata_poo;

public interface Promocional {
    void aplicarDesconto(double valor);
    
    public static void main(String[] args) {
		Livro livro = new Livro(60);
		Revista revista = new Revista(5);
		
		livro.aplicarDesconto(40);
		livro.aplicarDesconto(20);
		revista.aplicarDesconto(30);	
	}
}