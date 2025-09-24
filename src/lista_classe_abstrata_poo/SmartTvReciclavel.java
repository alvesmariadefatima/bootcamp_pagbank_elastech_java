package lista_classe_abstrata_poo;

public class SmartTvReciclavel extends Controlavel implements Reciclavel {
	@Override
	public void reciclar() {
		desligar();
		System.out.println("Smart TV reciclada de forma segura!");
	}
	public static void main(String[] args) {
		SmartTvReciclavel tv = new SmartTvReciclavel();
		
		tv.ligar();
		tv.aumentarVolume();
		tv.diminuirVolume();
		tv.reciclar();
	}
}