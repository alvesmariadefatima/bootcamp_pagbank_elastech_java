package atividade_revisao_poo_java;

public class Circulo {
	private double raio;
	private final double pi = 3.14;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		return pi * raio * raio;
	}
	
	public void getRaio(double raio) {
		this.raio = raio;
	}
	
	public double setRaio(double raio) {
		return this.raio = raio;
	}
}