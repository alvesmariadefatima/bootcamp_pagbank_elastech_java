package atividade_revisao_poo_java;

public class Aluno {
	String nome;
	int idade;
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.nome = "Maria de Fátima";
		aluno.idade = 24;
		
		System.out.println("Nome do(a) aluno(a): " + aluno.nome);
		System.out.println("Idade: " + aluno.idade);
	}
}