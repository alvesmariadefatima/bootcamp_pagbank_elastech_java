package lista_exercicios_operadores_relacionais_java;

import java.util.Scanner;

public class ValidaLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String usuarioCorreto = "admin";
		String senhaCorreta = "java123";
		
		System.out.println("Digite seu usuário: ");
		String usuarioDigitado = sc.next();
		
		System.out.println("Digite sua senha: ");
		String senhaDigitada = sc.next();
		
		if(!usuarioCorreto.equals(usuarioCorreto)) {
			System.out.println("Login incorreto");
		} else if (!senhaCorreta.equals(senhaDigitada)) {
			System.out.println("Senha inválida");
		} else {
			System.out.println("Login correto");
		}
		sc.close();
	}
}