package lista_polimorfismo_poo;

public class Veiculo {
	public void acelerar() {
		System.out.println("O veículo acelerou");
	}
	
	public static void main(String[] args) {
		Carro c1 = new Carro();
		Moto m1 = new Moto();
		
		c1.acelerar();
		m1.acelerar();
	}
}
