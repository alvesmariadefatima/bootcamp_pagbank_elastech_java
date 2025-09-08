package lista_heranca_java;

public class Carro extends Veiculo {
	int portas;
	
	public Carro(String marca, int ano, int portas) {
		super(marca, ano);
		this.portas = portas;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Informações sobre o carro: ");
		System.out.println("\n=========================");
		System.out.println("Portas: " + this.portas);
	}
	
	public void acelerar() {
		System.out.println("Vrum vrum...");
	}
	
	public static void main(String[] args) {
		Carro c1 = new Carro("Chevrolet", 2015, 4);
		Moto m1 = new Moto("Honda", 2017);
		
		m1.acelerar();

		System.out.println("Marca do carro: " + c1.marca);
		System.out.println("Ano: " + c1.ano);
		System.out.println("Portas: " + c1.portas);
		
		c1.mostrarInfo();
	}
}