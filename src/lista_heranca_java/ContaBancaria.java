package lista_heranca_java;

public class ContaBancaria {
	private double saldoInicial;
	
	public ContaBancaria(double saldoInicial) {
		this.setSaldoInicial(saldoInicial);
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
}