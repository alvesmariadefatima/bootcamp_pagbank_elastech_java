package lista_instancia_poo;

public class Aluno {
	String nome;
	String curso;
	
	public Aluno(String nome, String curso) {
		this.nome = nome;
		this.curso = curso;
	}
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Maria de Fátima", "Ciência da Computação");
		
		System.out.println("Nome: " + aluno1.nome);
		System.out.println("Curso: " + aluno1.curso);
	}
}