package aulas_java;

public class DivisaoEResto {

	public static void main(String[] args) {
		int dividendo = 25;
		int divisor = 4;
		int quociente = dividendo / divisor;
		
		double restoDivisao = dividendo % divisor;
		
		System.out.println("O quociente da divisão é: " + quociente);
		System.out.println("O resto da divisão é: " + restoDivisao);
	}
}