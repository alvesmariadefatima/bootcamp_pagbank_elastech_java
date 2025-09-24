package atividade_revisao_poo_java;

public class ContaCorrente extends ContaBancaria {
	private final double LIMITE = 500.00;
	
	public ContaCorrente (int numeroConta, String titular, double saldo){
		super(numeroConta, titular, saldo);
	}
	
	@Override
	public void exibirTipoConta() {
		System.out.println("Conta Corrente - Titular: " + getTitular());
	}
	
	@Override
	public void sacar(double valor) {
		if(valor > 0 && valor <= (saldo + LIMITE)) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado na conta corrente de " + getTitular());
		} else {
			System.out.println("Saque não permitido! Valor acima do saldo + limite de R$ " + LIMITE);
		}
	}
}