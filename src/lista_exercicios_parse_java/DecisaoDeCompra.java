package lista_exercicios_parse_java;

public class DecisaoDeCompra {

	public static void main(String[] args) {
		String saldoConta = "500.75";
		String precoProduto = "499.99";
		
		String temCredito = "true";
		
		double valor_saldo_conta = Double.parseDouble(saldoConta);
		double valor_preco_produto = Double.parseDouble(precoProduto);
		boolean tem_credito = Boolean.parseBoolean(temCredito);
		
		System.out.println("Saldo da conta: " + valor_saldo_conta);
		System.out.println("Preço do produto: " + valor_preco_produto);
		System.out.println("Possui crédito: " + tem_credito);
	}
}