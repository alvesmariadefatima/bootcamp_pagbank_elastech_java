package lista_instancia_poo;

public class Carro {
	String cor;

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.cor = "Vermelho";
		c2.cor = "Cinza";
		
		System.out.println(c1.cor);
		System.out.println(c2.cor);
	}
}
