package lista_classe_abstrata_poo;

public abstract class Veiculo {
	String marca;
	String modelo;
	
	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public abstract void acelerar();
	
	public static void main(String[] args) {
		SmartCarro carro = new SmartCarro("Ford", "Ford 2018");
		
		carro.acelerar();
		carro.conectarWifi();
	}
}