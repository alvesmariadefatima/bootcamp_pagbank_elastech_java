package lista_exercicios_parse_java;

import java.util.Scanner;

public class CadastroUsuario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leitor.next();
		
		System.out.println("Digite sua idade: ");
		String idade = leitor.next();
		
		System.out.println("Digite seu salário: ");
		String salario = leitor.next();
		
		int idadeFormat = Integer.parseInt(idade);
		double salarioFormat = Double.parseDouble(salario);
		
		String texto = String.format("O usuário %s, de %d anos," +  " tem um salário de R$ %,.2f", nome, idadeFormat, salarioFormat);
	
		System.out.println(texto);
		leitor.close();
	}
}