package lista_heranca_java;

public class Pessoa {
	 String nome;
	 private String cpf;
	 int idade;
	 
	 public Pessoa(String nome, String cpf, int idade) {
		 this.nome = nome;
		 this.cpf = cpf;
		 this.idade = idade;
	 }
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.nome = "Maria de Fátima";
		aluno.matricula = 1212515703;
		aluno.idade = 24;
		
		System.out.println("Nome do(a) aluno(a): " + aluno.nome);
		System.out.println("Matrícula: " + aluno.matricula);
		System.out.println("Idade: " + aluno.idade);
		
		Pessoa pessoa = new Pessoa("Maria de Fátima", "41625344899", 24);
		System.out.println("CPF: " + pessoa.getCpf());		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String nome, String cpf) {
		this.setNome(nome);
		this.cpf = cpf;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}
}