package atividade_revisao_poo_java;

public interface OperacoesBancarias {
	void depositar(double valor);
	void sacar(double valor);
	void transferir(ContaBancaria destino, double valor);
}