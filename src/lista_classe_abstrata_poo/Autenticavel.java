package lista_classe_abstrata_poo;

public interface Autenticavel {
	void login();
	void logout();
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Administrador administrador = new Administrador();
		
		cliente.login();
		cliente.logout();
		administrador.login();
		administrador.logout();
	}
}