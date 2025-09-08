package lista_heranca_java;

public class Veiculo {
	String marca;
	int ano;
	
	public Veiculo(String marca, int ano) {
		this.marca = marca;
		this.ano = ano;
	}
	
	public void mostrarInfo() {
		System.out.println("Dados do veículo: ");
		System.out.println("\n================");
		System.out.println("Marca: " + this.marca);
		System.out.println("Ano: " + this.ano);
	}
	
	public void acelerar() {
		System.out.println("Acelerando...");
	}
}