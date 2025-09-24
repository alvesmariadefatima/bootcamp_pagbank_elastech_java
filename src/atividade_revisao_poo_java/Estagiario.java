package atividade_revisao_poo_java;

public class Estagiario extends Funcionario {
	public Estagiario(String nome, Departamento departamento) {
		super(nome, departamento);
	}

	@Override
	public void calcularSalario() {
		System.out.println("O salário de um estagiário é R$ 1200.00");
	}
}