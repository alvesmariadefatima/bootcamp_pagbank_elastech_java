package lista_construtores_poo_java;

public class Carro {
	String marca;
	int ano;
	
	public Carro() {
		this("Desconhecida", 0);
	}
	
	public Carro(String marca, int ano) {
		this.marca = marca;
		this.ano = ano;
	}
	
	public void exibeValores() {
		System.out.println("Valores do produto: ");
		System.out.println("O carro da marca " + marca + " é do ano " + ano);
	}
}