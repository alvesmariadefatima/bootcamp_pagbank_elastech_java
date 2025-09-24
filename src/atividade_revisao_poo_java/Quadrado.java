package atividade_revisao_poo_java;

public class Quadrado {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return lado * lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(4);
		
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
	}
}