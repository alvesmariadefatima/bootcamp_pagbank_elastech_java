package lista_heranca_java;

public class ContaCorrente extends ContaBancaria {
	public ContaCorrente(double saldoInicial) {
		super(saldoInicial);
	}
	
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(500.00);
		
		conta.getSaldoInicial();
		
		System.out.println(conta.getSaldoInicial());
	}
}