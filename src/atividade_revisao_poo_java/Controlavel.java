package atividade_revisao_poo_java;

public class Controlavel {
	boolean ligado;
	
	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
	
	public static void main(String[] args) {
		Televisao tv = new Televisao();
		Radio radio = new Radio();
		
		tv.ligar();
		tv.desligar();
		radio.ligar();
		radio.desligar();
	}
}