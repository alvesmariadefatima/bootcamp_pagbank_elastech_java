package atividade_revisao_poo_java;

import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria implements OperacoesBancarias {
	protected int numeroConta;
	protected String titular;
	protected double saldo;
	
	public ContaBancaria(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
		} else {
			System.out.println("Valor de depósito inválido!");
		}
	}
	
	@Override
	public void sacar(double valor) {
		if(valor > 0 && saldo >= valor) {
			saldo += valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente ou valor inválido!");
		}
	}
	
	@Override
	public void transferir(ContaBancaria destino, double valor) {
		if(valor > 0 && saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("Transferência de R$ " + valor + " realizada com sucesso para " + destino.getTitular());
		} else {
			System.out.println("Transferência não realizada. Saldo insuficiente ou valor inválido!");
		}
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public abstract void exibirTipoConta();
	
	public static void main(String[] args) {
		ContaCorrente corrente = new ContaCorrente(246987, "Maria de Fátima Nunes Alves", 4500.00);
		ContaCorrente corrente1 = new ContaCorrente(148945, "Carla Eduarda", 2500.00);
		ContaPoupanca poupanca = new ContaPoupanca(1234567, "João Silva", 1700.00);
		ContaPoupanca poupanca2 = new ContaPoupanca(199568, "Carlos Eduardo", 1700.00);
		
		List<ContaBancaria> lista = new ArrayList<>();
		lista.add(corrente);
		lista.add(corrente1);
		lista.add(poupanca);
		lista.add(poupanca2);
		
		for(ContaBancaria conta : lista) {
			conta.exibirTipoConta();
			conta.depositar(500);
			conta.sacar(200);
			System.out.println("Saldo atual: R$ " + conta.getSaldo());
			System.out.println("-------------------------------------");
		}
	}
}