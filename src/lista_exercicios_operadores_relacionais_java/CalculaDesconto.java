package lista_exercicios_operadores_relacionais_java;

import java.util.Scanner;

public class CalculaDesconto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		double valorCompra = teclado.nextDouble();
		double valorFinal;
		
		if(valorCompra >= 200) {
			valorFinal = valorCompra * 0.85;
			System.out.println("Desconto de 15% aplicado!");
		} else {
			valorFinal = valorCompra;
			System.out.println("Nenhum desconto aplicado.");
		}
		System.out.println("Valor final da compra: R$ " + valorFinal);
		teclado.close();
	}
}