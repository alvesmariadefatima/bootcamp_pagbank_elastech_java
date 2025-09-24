package atividade_revisao_poo_java;

public class Calculadora {
	public int somar(int a, int b) {
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	public int dividir(int a, int b) {
		try {
			if(b == 0) {
				throw new ArithmeticException("Não pode dividir por zero!!!");
			}
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		
		System.out.println("Soma: " + c1.somar(4, 6));
	    System.out.println("Subtração: " + c1.subtrair(8, 3));
	    System.out.println("Multiplicação: " + c1.multiplicar(5, 2));
	    System.out.println("Divisão: " + c1.dividir(10, 7));
	}
}