package atividade_revisao_poo_java;

public class ContaSimples {
	private double saldo;
	
	public double depositar(double valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException("O valor do depósito deve ser positivo");
		}
		saldo += valor;
		return saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public static void main(String[] args) {
		ContaSimples c1 = new ContaSimples();
		
		c1.saldo = 1500.00;
		
		try {
			c1.depositar(-670.00);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		System.out.println("Salário: " + c1.saldo);
	}
}