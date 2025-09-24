package lista_classe_abstrata_poo;

public class SmartCarro extends Veiculo implements Conectavel {
	public SmartCarro(String marca, String modelo) {
		super(marca, modelo);
	}
	
	@Override
	public void acelerar() {
		System.out.println(getModelo() + " está se movendo.");
	}
	
	@Override
	public void conectarWifi() {
		System.out.println(getModelo() + " conectado ao Wi-Fi!");
	}
}