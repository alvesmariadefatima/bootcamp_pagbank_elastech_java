package atividade_revisao_poo_java;

public class ContaPoupanca extends ContaBancaria {
	public ContaPoupanca (int numeroConta, String titular, double saldo) {
		super(numeroConta, titular, saldo);
	}
	
	@Override
	public void exibirTipoConta() {
		System.out.println("Conta Poupança - Titular: " + getTitular());
	}
	
	public void calcularRendimento() {
		double rendimento = saldo * 0.02;
		saldo += rendimento;
		System.out.println("Rendimento de 2% aplicado! Valor: R$ " + rendimento
				+ " | Novo saldo: R$ " + saldo);
	}
}