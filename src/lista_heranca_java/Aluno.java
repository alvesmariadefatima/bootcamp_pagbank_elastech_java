package lista_heranca_java;

public class Aluno extends Pessoa {
	int matricula;
	
	public Aluno() {
		super("Maria", "41625344899", 24);
	}
	
	public void estudar() {
		System.out.println("Estudando");
	}
	public static void main(String[] args) {
		Professor professor = new Professor();
		
		professor.ensinar();
	}
}