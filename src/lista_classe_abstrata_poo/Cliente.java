package lista_classe_abstrata_poo;

public class Cliente implements Autenticavel {

	@Override
	public void login() {
		System.out.println("Login efetuado com sucesso como cliente!");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout efetuado com sucesso como cliente!");
	}
}
