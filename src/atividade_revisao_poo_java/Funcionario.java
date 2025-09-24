package atividade_revisao_poo_java;

public class Funcionario {
	String nome;
	Departamento departamento;
	
	public Funcionario(String nome, Departamento departamento) {
		this.nome = nome;
		this.departamento = departamento;
	}
	
	public void calcularSalario() {
		System.out.println("Seu salário fixo é: ");
	}
	public static void main(String[] args) {
//		Gerente gerente = new Gerente();
//		Estagiario estagiario = new Estagiario();
//		
//		gerente.calcularSalario();
//		estagiario.calcularSalario();
		Departamento d = new Departamento("Tecnologia da Informação");
		
		Funcionario f1 = new Funcionario("Maria", d);
		Funcionario f2 = new Funcionario("Carlos", d);
		
		System.out.println(f1.nome + " trabalha no departamento de " + f1.departamento.nome);
		System.out.println(f2.nome + " trabalha no departamento de " + f2.departamento.nome);
	}
}