package lista_exercicios_switch_case_java;

import java.util.Scanner;

public class LoginNivelAcesso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String admin = "admin";
		String usuario = "usuario";
		String guest = "guest";
		String senha = "java123";
		
		System.out.println("Digite seu nome de usuário: ");
		String user = sc.next();
		
		System.out.println("Digite sua senha: ");
		String password = sc.next();
		
		if(user.equals(admin) ||
				user.equals(user) ||
				user.equals(guest)) {
			if(password.equals(password)) {
				switch(user) {
					case "admin":
						System.out.println("Olá admin, você tem acesso ao sistema completo.");
					break;
					
					case "usuario":
						System.out.println("Olá usuário, você tem acesso limitado ao sistema.");
					break;
					
					case "guest":
						System.out.println("Olá guest, você tem acesso de visualização do sistema");
					break;
				}
			} else {
				System.out.println("Senha incorreta");
			}
			} else {
				System.out.println("Usuário incorreto");
			}
		sc.close();
		}
	}