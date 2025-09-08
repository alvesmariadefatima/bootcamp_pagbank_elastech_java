package lista_heranca_java;

public class Funcionario {
	public void trabalhar() {
		System.out.println("Trabalhando");
	}
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.trabalhar();
	}
}