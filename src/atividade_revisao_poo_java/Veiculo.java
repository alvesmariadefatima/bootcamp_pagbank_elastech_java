package atividade_revisao_poo_java;

public class Veiculo {
	public void mover() {
		System.out.println("O veículo está se movendo");
	}
	public static void main(String[] args) {
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		carro.mover();
		moto.mover();
	}
}