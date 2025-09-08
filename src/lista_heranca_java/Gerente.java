package lista_heranca_java;

public class Gerente extends Funcionario {
	public void trabalhar() {
		System.out.println("Gerenciando");
	}
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.trabalhar();
	}
}
