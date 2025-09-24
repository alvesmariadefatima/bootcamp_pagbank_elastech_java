package atividade_revisao_poo_java;

public class Radio extends Controlavel {
	@Override
	public void ligar() {
		System.out.println("Rádio ligada");
	}
	
	@Override
	public void desligar() {
		System.out.println("Rádio desligada");
	}
}