package lista_construtores_poo_java;

public class Aluno {
	String nome;
	int idade;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void exibirDadosAluno() {
		System.out.println("Dados do aluno");
		System.out.println("\n------------");
		System.out.println("Nome do(a) aluno(a): " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("\n------------");
	}
}
