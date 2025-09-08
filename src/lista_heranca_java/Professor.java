package lista_heranca_java;

public class Professor extends Pessoa {
	public Professor() {
		super("Carlos", "12345678", 20);
	}
	
	public void ensinar() {
		System.out.println("Ensinando");
	}
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.estudar();
	}
}
