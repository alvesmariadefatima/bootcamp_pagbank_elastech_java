package lista_exercicios_parse_java;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		String peso = leitor.next();
		
		System.out.println("Digite sua altura");
		String altura = leitor.next();
		
		double pesoFormat = Double.parseDouble(peso);
		double alturaFormat = Double.parseDouble(altura);
		
		double imc = pesoFormat / (alturaFormat * alturaFormat);
		
		System.out.println("Seu IMC: %.2f" + imc);
		
		leitor.close();
	}
}
