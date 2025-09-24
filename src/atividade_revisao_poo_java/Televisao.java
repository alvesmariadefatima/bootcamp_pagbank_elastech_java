package atividade_revisao_poo_java;

public class Televisao extends Controlavel{
	@Override
	public void ligar() {
		System.out.println("TV ligada");
	}
	
	@Override
	public void desligar() {
		System.out.println("TV desligada");
	}
}