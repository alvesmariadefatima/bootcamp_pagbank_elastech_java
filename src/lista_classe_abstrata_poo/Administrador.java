package lista_classe_abstrata_poo;

public class Administrador implements Autenticavel {

	@Override
	public void login() {
		System.out.println("Login autenticado com sucesso como administrador!");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout autenticado com sucesso como administrador!");
	}
}
