package lista_heranca_java;

public class Moto extends Veiculo {
	int cilindradas;
	
	public Moto(String marca, int ano) {
		super(marca, ano);
	}
	
	public void mostrarInfo() {
		System.out.println("Informações sobre a moto: ");
		System.out.println("\n========================");
		System.out.println("Marca: " + this.marca);
		System.out.println("Ano: " + this.ano);
	}

	public void acelerar() {
		super.acelerar();
		System.out.println("Vuuuuuuuuuuum");
	}
	
	public static void main(String[] args) {
		Moto m1 = new Moto("Honda", 2010);
		
		m1.mostrarInfo();
	}
}